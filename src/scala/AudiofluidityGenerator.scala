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
      description          = """|<p>Nothing to write home about, but I guess it's audio!.</p>
                                |
                                |<p><b>Links:</b> <a href="https://en.wikipedia.org/wiki/%22Hello,_World!%22_program">Hello World!</a>""".stripMargin, 
      sourceAudioFileName  = "HelloScratchfluidity.mp3",    // String
      publicationDate      = "2021-10-08",       // String, Format: YYYY-MM-DD
      mbSubtitle           = Some("It's pretty underwhelming!")  
    )

  val episodes : List[Episode] = episode1 :: Nil

  val podcast : Podcast =
    Podcast(
      mainUrl             = "https://scratch.audiofluidity.com/",
      title               = "Scratchfluidity",  
      description         = """|<p>This is a test podcast, used to help develop <i>audiofluidity</i>.</p>
                               |
                               |<p>I hope you like it.""".stripMargin, 
      guidPrefix          = "com.mchange.scratchfluidity-",
      shortOpaqueName     = "scratchfluidity",  
      mainImageFileName   = "scratchfluidity-on-chalkwave.jpg", 
      editorEmail         = "swaldman@mchange.com", 
      defaultAuthorEmail  = "swaldman@mchange.com",
      itunesCategories    = immutable.Seq( ItunesCategory.Society_Culture_Personal_Journals ),
      mbAdmin             = Some(Admin(name="Steve Waldman", email="swaldman@mchange.com")),
      mbCopyrightHolder   = Some("Machinery For Change, LLC"),
      mbLanguage          = Some(LanguageCode.EnglishUnitedStates),  //Option[LanguageCode], not mandatory as RSS, but strongly recommended by Apple Podcast
      mbPublisher         = Some("Machinery For Change, LLC"),       //Option[String] not mandatory as RSS, but required for Apple Podcast support
      episodes            = episodes
    )

  val deployer = new Deployer.Exec(preparsedCommand = immutable.Seq("rsync", "-av", ".", "swaldman@tickle.mchange.com:/home/web/public/audiofluidity-scratch"))
