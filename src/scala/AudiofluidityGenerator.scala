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

  val episode2 =
    Episode(
      uid                  = "2",
      title                = "I dream of axolotls",
      description          = """|<p>
                                |  I wanted to make an "episode", but the kid was very loudly playing Minecraft.
                                |  So, I recorded the kid, and cut clips of his gaming exclamations into this (fake) interview.
                                |  (The kid was just gaming; the questions I made up after the fact had nothing to do with what he was responding to.)
                                |</p>
                                |
                                |<p>
                                |  Of course there's weird MIDI music.
                                |</p>
                                |
                                |<p>
                                |  Anyway, it seems kind of fun!
                                |</p>
                                |
                                |<p><b>Credits:</b> <a href="https://www.pexels.com/photo/white-fish-under-water-2168831/">Episode cover photo</a> by Artem Lysenko from Pexels
                                |
                                |""".stripMargin,
      sourceAudioFileName  = "Leon-Playing-Minecraft-As-Interview.mp3",
      publicationDate      = "2021-10-11",
      publicationTime      = "17:00",
      mbCoverImageFileName = Some("pexels-artem-lysenko-2168831-small.jpg")
    )

  val episode3 = Episode(
    uid                    = "3",
    title                  = "Leon opens Pokemon, 2012-10-12",
    description            = s"""|<p>
                                 |  <b>Leon's passion these days</b> is Pokemon, and for a while we've been practicing
                                 |  our audio production skills by recording little 'podcasts' on the special days
                                 |  when he gets to open a new pack. Now that we have this, um, podcast, we figured
                                 |  we'd publish this little family event. Enjoy!
                                 |</p>
                                 |
                                 |<p>As always, I had fun with the music. It's become my little vice.</p>
                                 |""".stripMargin,
    sourceAudioFileName    = "Leon-Opening-Pokemon-2021-10-12.mp3",
    publicationDate        = "2021-10-12",
    publicationTime        = "19:45",
    mbAuthorEmail          = Some("swaldman@mchange.com") 
  )

  val episode4 = Episode(
    uid                    = "4",
    title                  = "Some more MIDI music",
    description            = s"""|<p>
                                 |  <b>I seem to think</b> it's the coolest thing that, with my very limited musical
                                 |  skills, I can use MIDI and synthesizer plugins to make what sounds like "real music".
                                 |  This is a "composition" derived from mixing a transforming a single arpegio, and adding
                                 |  in just a bit of pseudocello as harmony. It ends rather abruptly, though.
                                 |</p>
                                 |""".stripMargin,
    sourceAudioFileName    = "piano-harp-cello_2.mp3",
    publicationDate        = "2021-10-23",
    publicationTime        = "03:05",
    mbAuthorEmail          = Some("swaldman@mchange.com") 
  )


  val episodes : List[Episode] = episode1 :: episode2 :: episode3 :: episode4 :: Nil

  val podcast : Podcast =
    Podcast(
      mainUrl                = "https://scratch.audiofluidity.com/",
      title                  = "Scratchfluidity",  
      description            = """|<p><b style="color: white;">Ceci n'est pas un podcast.</b></p>
                                  |
                                  |<p>Ok, it's kind of a podcast. It's a test podcast, used to help develop <i>audiofluidity</i>.</p>
                                  |
                                  |<p>I hope you like it.</p>""".stripMargin,
      extraDescription       = """<p style="font-size: smaller;"><i>Background courtesy of <a href="https://www.toptal.com/designers/subtlepatterns/double-bubble-dark-pattern/">Toptal</a>.</i></p>""", 
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
