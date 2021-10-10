import audiofluidity.*
import audiofluidity.Element.Itunes

import java.time.ZoneId
import scala.collection.*

class AudiofluidityGenerator extends PodcastGenerator.Base:

  // only mandatory parameters are shown in the generated template.
  // Many more parameters can and usually should be provided.
  // See the source, Episode.scala and Podcast.scala

  val episode1 = 
    Episode(
      uid                  = "1",  
      title                = "Kind of spooky MIDI music, and a first attempt.",
      description          = """|<p>Nothing to write home about, but I guess it's audio!</p>
                                |
                                |<p><b>Links:</b> <a href="https://en.wikipedia.org/wiki/%22Hello,_World!%22_program">Hello World!</a>""".stripMargin, 
      sourceAudioFileName  = "HelloScratchfluidity.mp3",    // String
      publicationDate      = "2021-10-08",       // String, Format: YYYY-MM-DD
      mbSubtitle           = Some("It's pretty underwhelming!")  
    )

  val episodes : List[Episode] = episode1 :: Nil

  val podcast : Podcast =
    Podcast(
      mainUrl                = "https://scratch.audiofluidity.com/",
      title                  = "Scratchfluidity",  
      description            = """|<p><b style="color: white;">Ceci n'est pas un podcast.</b></p>
                                  |
                                  |<p>Ok, it's kind of a podcast. It's a test podcast, used to help develop <i>audiofluidity</i>.</p>
                                  |
                                  |<p>I hope you like it.</p>
                                  |
                                  |<p style="font-size: smaller;"><i>Background courtesy of <a href="https://www.toptal.com/designers/subtlepatterns/double-bubble-dark-pattern/">Toptal</a>.</i></p>""".stripMargin, 
      guidPrefix             = "com.mchange.scratchfluidity-",
      shortOpaqueName        = "scratchfluidity",  
      mainCoverImageFileName = "scratchfluidity-on-chalkwave.jpg", 
      editorEmail            = "swaldman@mchange.com", 
      defaultAuthorEmail     = "swaldman@mchange.com",
      itunesCategories       = immutable.Seq( ItunesCategory.Society_Culture_Personal_Journals ),
      mbAdmin                = Some(Admin(name="Steve Randy Waldman", email="swaldman@mchange.com")),
      mbCopyrightHolder      = Some("Machinery For Change, LLC"),
      mbLanguage             = Some(LanguageCode.EnglishUnitedStates),
      mbPublisher            = Some("Machinery For Change, LLC"),
      episodes               = episodes
    )

  val deployer = new Deployer.Exec(preparsedCommand = immutable.Seq("rsync", "-av", ".", "swaldman@tickle.mchange.com:/home/web/public/audiofluidity-scratch"))
