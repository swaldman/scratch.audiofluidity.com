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
      publicationDate      = "2021-10-05",       // String, Format: YYYY-MM-DD
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
      guidPrefix          = "com.mchange.test-audiofluidity-",
      shortOpaqueName     = "scratchfluidity",  
      mainImageFileName   = "interfluidity-wave.jpg", 
      editorEmail         = "swaldman@mchange.com", 
      defaultAuthorEmail  = "swaldman@mchange.com", 
      episodes            = episodes
    )
