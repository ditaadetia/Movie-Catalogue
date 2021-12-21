package com.ditadetian.moviecatalogue.utils

import com.ditadetian.moviecatalogue.R
import com.ditadetian.moviecatalogue.data.MovieEntity
import com.ditadetian.moviecatalogue.data.TvShowEntity

object DataDummy {

    private val dataMoviePoster = intArrayOf(
        R.drawable.poster_aquaman,
        R.drawable.poster_bohemian,
        R.drawable.poster_cold_persuit,
        R.drawable.poster_creed,
        R.drawable.poster_crimes,
        R.drawable.poster_glass,
        R.drawable.poster_how_to_train,
        R.drawable.poster_infinity_war,
        R.drawable.poster_marry_queen,
        R.drawable.poster_master_z)

    private val dataMovieName = arrayOf(
        "Aquaman",
        "Bohemian Rhapsody",
        "Cold Pursuit",
        "Creed II",
        "Fantastic Beasts: The Crimes of Grindelwald",
        "Glass",
        "How to Train Your Dragon: The Hidden World",
        "Avengers: Infinity War",
        "Mary Queen of Scots",
        "Master Z: Ip Man Legacy")

    private val dataMovieYear = arrayOf(
        2018,
        2018,
        2019,
        2018,
        2018,
        2019,
        2019,
        2018,
        2018,
        2018)

    private val dataMovieRelease = arrayOf(
        "12/21/2018 (US)",
        "11/02/2018 (US)",
        "02/08/2019 (US)",
        "11/21/2018 (US)",
        "11/16/2018 (US)",
        "01/18/2019 (US)",
        "02/22/2019 (US)",
        "04/27/2018 (US)",
        "12/21/2018 (US)",
        "12/26/2018 (TW)")

    private val dataMovieAge = arrayOf(
        "PG-13",
        "PG-13",
        "R",
        "PG-13",
        "PG-13",
        "PG-13",
        "PG",
        "PG-13",
        "R",
        "PG-13")

    private val dataMovieGenre = arrayOf(
        "Action, Adventure, Fantasy",
        "Music, Drama, History",
        "Action, Crime, Thriller",
        "Drama",
        "Adventure, Fantasy, Drama",
        "Thriller, Drama, Science Fiction",
        "Animation, Family, Adventure",
        "Adventure, Action, Science Fiction",
        "Drama, History",
        "Action")

    private val dataMovieDuration = arrayOf(
        "2h 24m",
        "2h 15m",
        "1h 59m",
        "2h 10m",
        "2h 14m",
        "2h 9m",
        "1h 44m",
        "2h 29m",
        "2h 4m",
        "1h 47m")

    private val dataMovieScore = arrayOf(
        69,
        80,
        56,
        69,
        69,
        66,
        78,
        83,
        66,
        62)

    private val dataMovieTagLine = arrayOf(
        "Home Is Calling",
        "Fearless lives forever",
        "Meet Nels Coxman. Citizen of the Year.",
        "There\'s More to Lose than a Title",
        "Fate of One. Future of All.",
        "You Cannot Contain What You Are",
        "The friendship of a lifetime",
        "An entire universe. Once and for all.",
        "Bow to No One",
        "-")

    private val dataMovieOverview = arrayOf(
        "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm\'s half-human, half-Atlantean brother and true heir to the throne.",
        "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
        "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son\'s murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking\'s associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
        "Between personal obligations and training for his next big fight against an opponent with ties to his family\'s past, Adonis Creed is up against the challenge of his life.",
        "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
        "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
        "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
        "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
        "In 1561, Mary Stuart, widow of the King of France, returns to Scotland, reclaims her rightful throne and menaces the future of Queen Elizabeth I as ruler of England, because she has a legitimate claim to the English throne. Betrayals, rebellions, conspiracies and their own life choices imperil both Queens. They experience the bitter cost of power, until their tragic fate is finally fulfilled.",
        "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.", )

    private val dataMoviePerson = arrayOf(
        "James Wan (Director, Story), Will Beall (Screenplay, Story), Mort Weisinger (Characters), Paul Norris (Characters), David Leslie Johnson-McGoldrick (Screenplay), Geoff Johns (Story)",
        "Anthony McCarten (Screenplay, Story), Bryan Singer (Director), Peter Morgan (Story)",
        "Hans Petter Moland (Director), Frank Baldwin (Screenplay)",
        "Sylvester Stallone (Characters, Screenplay), Steven Caple Jr. (Director), Juel Taylor (Screenplay), Sascha Penn (Story), Cheo Hodari Coker (Story)",
        "David Yates (Director), J.K. Rowling (Screenplay)",
        "M. Night Shyamalan (Director, Screenplay)",
        "Dean DeBlois (Director, Screenplay, Story), Cressida Cowell (Novel)",
        "Anthony Russo (Director), Joe Russo (Director), Christopher Markus (Screenplay), Stephen McFeely (Screenplay)",
        "Josie Rourke (Director), Beau Willimon (Screenplay)",
        "Yuen Woo-ping (Director), Chan Tai-Li (Screenplay), Edmond Wong (Screenplay)")

    private val dataTvShowPoster = intArrayOf(
        R.drawable.poster_doom_patrol,
        R.drawable.poster_dragon_ball,
        R.drawable.poster_fairytail,
        R.drawable.poster_family_guy,
        R.drawable.poster_flash,
        R.drawable.poster_gotham,
        R.drawable.poster_grey_anatomy,
        R.drawable.poster_hanna,
        R.drawable.poster_naruto_shipudden,
        R.drawable.poster_ncis)

    private val dataTvShowName = arrayOf(
        "Doom Patrol",
        "Dragon Ball",
        "Fairy Tail: Dragon Cry",
        "Family Guy",
        "The Flash",
        "Gotham",
        "Grey\'s Anatomy",
        "Hanna",
        "Naruto Shippūden",
        "NCIS")

    private val dataTvShowYear = arrayOf(
        2019,
        1986,
        2017,
        1999,
        2014,
        2014,
        2005,
        2019,
        2007,
        2003)

    private val dataTvShowRelease = arrayOf(
        "02/15/2019",
        "02/26/1986",
        "05/06/2017",
        "01/31/1999",
        "10/07/2014",
        "09/22/2014",
        "03/27/2005",
        "03/28/2019",
        "02/15/2007",
        "09/23/2003")

    private val dataTvShowAge = arrayOf(
        "TV-MA",
        "TV-PG",
        "15",
        "TV-14",
        "TV-14",
        "TV-14",
        "TV-14",
        "TV-MA",
        "TV-PG",
        "TV-14")

    private val dataTvShowGenre = arrayOf(
        "Sci-Fi & Fantasy, Action & Adventure, Comedy",
        "Comedy, Sci-Fi & Fantasy, Animation, Action & Adventure",
        "Action, Adventure, Comedy, Fantasy, Animation",
        "Animation, Comedy",
        "Drama, Sci-Fi & Fantasy",
        "Drama, Fantasy, Crime",
        "Drama",
        "Action & Adventure, Drama",
        "Animation, Action & Adventure, Sci-Fi & Fantasy",
        "Crime, Action & Adventure, Drama")

    private val dataTvShowDuration = arrayOf(
        "49m",
        "25m",
        "1h 25m",
        "22m",
        "44m",
        "43m",
        "43m",
        "50m",
        "25m",
        "45m")

    private val dataTvShowScore = arrayOf(
        76,
        81,
        66,
        69,
        76,
        75,
        82,
        74,
        86,
        75)

    private val dataTvShowTagLine = arrayOf(
        "-",
        "-",
        "-",
        "Parental Discretion Advised, that\'s how you know it\'s good",
        "The fastest man alive.",
        "Before Batman, there was Gotham.",
        "The life you save may be your own.",
        "-",
        "-",
        "-")

    private val dataTvShowOverview = arrayOf(
        "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
        "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku\'s home. Together, they set off to find all seven and to grant her wish.",
        "Natsu Dragneel and his friends travel to the island Kingdom of Stella, where they will reveal dark secrets, fight the new enemies and once again save the world from destruction.",
        "Sick, twisted, politically incorrect and Freakin\' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he\'s not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
        "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only human who was created in the wake of the accelerator explosion — and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won\'t be long before the world learns what Barry Allen has become…The Flash.",
        "Everyone knows the name Commissioner Gordon. He is one of the crime world\'s greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon\'s story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world\'s most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
        "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
        "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
        "Naruto Shippuuden is the continuation of the original animated TV series Naruto. The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
        "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.", )

    private val dataTvShowPerson = arrayOf(
        "Jeremy Carver (Creator)",
        "Akira Toriyama (Creator)",
        "Tatsuma Minamikawa (Director), Shoji Yonemura (Screenplay), Hiro Mashima (story)",
        "Seth MacFarlane (Creator)",
        "Greg Berlanti (Creator), Geoff Johns (Creator), Andrew Kreisberg (Creator)",
        "Bruno Heller (Creator)",
        "Shonda Rhimes (Creator)",
        "David Farr (Creator)",
        "-",
        "Donald P. Bellisario (Creator), Don McGill (Creator)")

    fun generateDummyMovies(): ArrayList<MovieEntity> {
        val movieEntities = ArrayList<MovieEntity>()
        for (position in dataMovieName.indices) {
            val movieEntity = MovieEntity(
                dataMoviePoster[position],
                dataMovieName[position],
                dataMovieYear[position],
                dataMovieRelease[position],
                dataMovieAge[position],
                dataMovieGenre[position],
                dataMovieDuration[position],
                dataMovieScore[position],
                dataMovieTagLine[position],
                dataMovieOverview[position],
                dataMoviePerson[position]
            )
            movieEntities.add(movieEntity)
        }
        return movieEntities
    }

    fun generateDummyTvShows(): ArrayList<TvShowEntity> {
        val tvShowEntities = ArrayList<TvShowEntity>()
        for (position in dataTvShowName.indices) {
            val tvShowEntity = TvShowEntity(
                dataTvShowPoster[position],
                dataTvShowName[position],
                dataTvShowYear[position],
                dataTvShowRelease[position],
                dataTvShowAge[position],
                dataTvShowGenre[position],
                dataTvShowDuration[position],
                dataTvShowScore[position],
                dataTvShowTagLine[position],
                dataTvShowOverview[position],
                dataTvShowPerson[position]
            )
            tvShowEntities.add(tvShowEntity)
        }
        return tvShowEntities
    }
}