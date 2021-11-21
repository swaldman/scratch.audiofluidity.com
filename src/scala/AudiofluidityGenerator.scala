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
    mbAuthorEmail          = Some("swaldman@mchange.com"),
    keywords               = immutable.Seq("Pokemon")
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


   val episode5 = Episode(
    uid                    = "5",
    title                  = "Leon opens Pokemon from Danielle",
    description            = s"""|<p><b>Leon got a suprise</b> in the mail.</p>
                                 |
                                 |<p>A tin containing several new packs of Pokemon cards from Danielle Feigerson!</p>
                                 |
                                 |<p>Thank you Danielle!</p>
                                 |""".stripMargin,
    sourceAudioFileName    = "Leon-Danielle-Pokemon-2021-10-23.mp3",
    publicationDate        = "2021-10-23",
    publicationTime        = "19:45",
    mbAuthorEmail          = Some("swaldman@mchange.com"),
    keywords               = immutable.Seq("Pokemon")
  )

   val episode6 = Episode(
    uid                    = "6",
    title                  = "Leon opens Pokemon cards from Grandma",
    description            = s"""|<p><b>Leon got <i>another</i> suprise</b> in the mail.</p>
                                 |
                                 |<p>This time it was a box of "rare" Pokemon from Grandma!</p>
                                 |
                                 |<p>Thank you Grandma!</p>
                                 |""".stripMargin,
    sourceAudioFileName    = "Leon-Opens-Pokemon-From-Grandma-2021-10-26.mp3",
    publicationDate        = "2021-10-27",
    publicationTime        = "00:15",
    mbAuthorEmail          = Some("swaldman@mchange.com"),
    keywords               = immutable.Seq("Pokemon")
  )

   val episode7 = Episode(
    uid                    = "7",
    title                  = "Gigantic Wings -- Leon and Aksel open Pokemon together",
    description            = s"""|<p>Leon opens Pokemon cards <b>along with friend and special guest Aksel!</b></p>
                                 |
                                 |<p>
                                 |  <i>I only have two "decent" mics, but we had a conversation of three in this episode.
                                 |  I recorded my voice on the mic built into a dirt-cheap pair of headphones, and did
                                 |  my best to sync it into the mix. It was terrible. Besides its low, buzzy, noisy, 
                                 |  quality, it caught everything, and this "bleed" sounded awful combined with the mix.
                                 |  I spent an inordinate time trying to "fix" all this, rigging a walkie-talkie like scheme
                                 |  where signal from the "good" mics would cause output from the bad mic to be suppressed
                                 |  and vice-versa. Along with a bunch of "plug ins" to suppress some of the noise and flesh out
                                 |  some of the tinniness of the bad mic itself, maybe it all kind of works. But if the audio
                                 |  sounds a bit processed or weird, you know why!</i>
                                 |</p>
                                 |""".stripMargin,
    sourceAudioFileName    = "Leon-and-Aksel-2021-11-09-redux.mp3",
    publicationDate        = "2021-11-13",
    publicationTime        = "23:00",
    mbAuthorEmail          = Some("swaldman@mchange.com"),
    keywords               = immutable.Seq("Pokemon")
  )

  val episode8 = Episode(
    uid                    = "8",
    title                  = "Leon finds Gengar V",
    description            = s"""|<p><b>Leon opens</b> a new pack of Pokemon cards, and finds a good one.</p>
                                 |
                                 |<p>Your humble producer plays with wacky vocal effects and beat-box plugins.</p>
                                 |
                                 |<p>Secrets are revealed.</p>
                                 |""".stripMargin,
    sourceAudioFileName    = "Leon-More-Pokemon-2021-11-19.mp3",
    publicationDate        = "2021-11-19",
    publicationTime        = "22:30",
    mbAuthorEmail          = Some("swaldman@mchange.com"),
    keywords               = immutable.Seq("Pokemon")
  )

  val episodes : List[Episode] = 
    episode1 :: episode2 :: episode3 :: episode4 :: episode5 :: episode6 :: episode7 :: episode8 :: Nil

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
