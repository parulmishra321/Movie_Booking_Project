create database movies;
use movies;
create table movie(m_id int(6) auto_increment NOT NULL PRIMARY KEY,
m_poster longblob NOT NULL, m_trailer longblob NOT NULL,
m_category varchar(20) NOT NULL, m_name varchar(30) NOT NULL,m_cast varchar(50) NOT NULL,
 m_release_date date NOT NULL, m_duration varchar(40) NOT NULL,
long_desc varchar(500) NOT NULL,short_desc varchar(200) NOT NULL,
m_country varchar(20) NOT NULL,m_lang varchar(30) NOT NULL);

select * from movie;
insert into movie values(null,'images\chhichhore.jpg','images\ChhichhoreTrailer.mp4','comedy','Chhichhore',
'Shraddha Kapoor,Sushant Singh Rajput','2019-09-06','2hours 23min','Raghav, 
 son of, As he battles for life in a hospital, his parents regroup with 
 their friends after decades. Together, this older generation, goes on a nostalgia trip 
 reminiscing their college days, hoping their bittersweet memories will help save a teenager',' 
 who has lost all will to live.','India','Hindi');
 select m_poster from movie;
 
 create database movie_list;
 use movie_list;
create table movies(m_id int(6) auto_increment NOT NULL PRIMARY KEY,
m_poster longblob NOT NULL, m_trailer longblob NOT NULL,
m_category varchar(100) NOT NULL, m_name varchar(100) NOT NULL,m_cast varchar(300) NOT NULL,
 m_release_date date NOT NULL, m_duration varchar(100) NOT NULL,
short_desc varchar(1000) NOT NULL,long_desc varchar(500) NOT NULL,
m_country varchar(50) NOT NULL,m_lang varchar(50) NOT NULL);

insert into movies values(null,'images\chhichhore.jpg','images\ChhichhoreTrailer.mp4','comedy',
'Chhichhore','Shraddha Kapoor, Tahir Bhasin, Sushant Singh Rajput,Tushar Pandey','2019-09-06',
'2hours 23min','Raghav, son of high achieving parents succumbs to the pressure
that comes with cut-throat entrance exams.','As he battles for life in a hospital, 
his parents regroup with their friends after decades. Together, this older generation, 
goes on a nostalgia trip reminiscing their college days, hoping their 
bittersweet memories will help save a teenager, who has lost all will to live.',
'India','Hindi');

insert into movies values(null,'images\Dream_Girl.png','images\Dreamgirl_trailer.mp4',
'comedy','Dream Girl','Ayushmann Khurrana,Nushrat Bharucha,Annu Kapoor,Manjot Singh, Vijay Raaz,
Abhishek Banerjee','2019-09-13','2hours 12min','Dream Girl is a 2019 Indian Hindi-language 
comedy film directed by Raaj Shaandilyaa and co-produced by Ekta Kapoor 
and Shobha Kapoor under their banner Balaji Motion Pictures','Desperate to find employment, 
Karam picks up a job as ‘Pooja’ at a call center for sex chats, 
keeping most people in his life in the dark about the nature of his work. 
How long can he keep it up before everyone 
including his girlfriend and father find out','India','hindi');
select * from movies;
insert into movies values(null,'images\Totaldhamaal.jpg','images\totaldhammal_trailer.mp4',
'comedy','Total Dhamaal',' Ajay Devgn,Anil Kapoor,Madhuri Dixit,Riteish Deshmukh,Arshad Warsi
','2019-02-22','2hours 20min','When a plane carrying a thiefs treasure crashes in Janakpur, 
a group of eccentric people and 
seasoned con artists compete against 
each other to find it first.','Ajay Devgn and Sanjai Mishra,
 a bickering couple Anil Kapoor and Madhuri Dixit who are on a verge of divorce,
 a fireman Riteish Deshmukh and his side-kick played by Pitobash Tripathy, greedy siblings Adi
 and Arshad Warsi and Boman Irani set out on a mad chase for a 
 hidden booty of Rs 50 crores in a zoo in Janakpur. In a run-time of over two hours, we are treated to 
 crash-landing helicopters,flooding rivers and some bonding with animals.
','India','hindi');

insert into movies values(null,'images\zoyafactor.jpg','images\zoyafactor_trailer.mp4',
'comedy','The Zoya Factor','Sonam Kapoor, Dulquer Salmaan, Sanjay Kapoor
','2019-09-20','2hours 14min','Based Anuja Chauhans novel, Zoya Factor is a rom-com about Zoya, 
an advertising agent and
 her relationship with the captain of team India, Nikhil Khoda.','The story revolves around a Rajput
 girl, Zoya Solanki, an executive in an advertising agency. She ends up becoming a lucky charm for the 
 Indian Cricket team during the 2011 Cricket World Cup. Nikhil Khoda(Dulquer) play the Indian
 Cricket Team captain and Zoyas love interest.
','India','hindi');

insert into movies values(null,'images\heraferi.jpg','images\heraferi_trailer.mp4',
'comedy','Hera Feri','Akshay Kumar, Sunil Shetty, Paresh Rawal
','2000-03-31','2hours 36min','Three unemployed men find the answer to all their money problems when
 they receive a call from a kidnapper. 
However, things do not go as planned.','Baburao is a landlord in India, who is very near-sighted, 
and always in financial trouble. He has a tenant named Raja, who has not paid his rent for several 
months.  The three men quarrel amongst themselves frequently.
 Then one day, the three men get a phone call from a kidnapper named Kabira, and decide to make use of 
 this phone call to overcome their financial problems, keep the incremental amount for themselves.
','India','hindi');
select * from movies;

insert into movies values(null,'images\Avengers.jpg','images\Avengers_trailer.mp4',
'action','Avengers:Endgame','Robert Downey Jr, Chris Evans,  Brie Larson,  Tom Holland
','2019-04-26','3hours 2min','With the help of remaining allies, the Avengers assemble once more in 
order to reverse Thanos 
actions and restore balance to the universe.','After half of all life is snapped away by Thanos,
 the Avengers are left scattered and divided. Along the way, the Avengers realize that sacrifices must 
 be made as they prepare 
 for the ultimate final showdown with Thanos, 
which will result in the heroes fighting the biggest battle they have ever faced.
','United States','english');

insert into movies values(null,'images\kabir-singh.jpg','images\kabirsingh_trailer.mp4',
'action','Kabir Singh','Shahid Kapoor,Kiara Advani,Soham Majumdar
','2019-06-21','2hours 52min','Kabir Singh is a remake of a Telugu movie, where a 
short-tempered 
house surgeon gets used to drugs and drinks when his girlfriend is forced to marry another person.',
'Kabir Rajdheer Singh is a house surgeon at Delhi Institute of Medical Sciences in New Delhi, India.
 Despite being a brilliant student, he has severe anger management problems that earn the wrath of the
 dean of the college. Kabirs aggressive nature also earns him a reputation among his juniors as a
 college bully.
','India','hindi');


