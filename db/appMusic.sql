create database appMusic

use appMusic

create table USERS
(
	matk int identity(1,1),
	tennd varchar(30) not null,
	matkhau varchar(30) not null,
	email varchar(50) not null,
	ngaysinh date ,
	chucvu bit,
	hinh nvarchar(50),
	ngaytao date
	
	constraint pk_user primary key(matk) ,
);

create table SONG
(
	mabh varchar(8),
	tenbh nvarchar(100) not null,
	theloai nvarchar(30) not null,
	nguoist nvarchar(100),
	nguoitb nvarchar(100) not null,
	anh nvarchar(50),
	musicpath nvarchar(100),
	ngaytao date
	
	constraint pk_song primary key(mabh),
);

create table USER_SONG
(
	id int identity(1,1),
	matk int ,
	mabh varchar(8),
	playcount int,
	ngaytao date
	
	constraint pk_usersong primary key(id),
	constraint fk_usersong_user foreign key (matk) references USERS(matk) on delete cascade,
	constraint fk_usersong_song foreign key (mabh) references SONG(mabh),
);

create table PLAYLIST
(
	maplaylist int identity(1,1),
	matk int,
	tieude nvarchar(50),
	counts int,
	hinh nvarchar(50),
	descriptions nvarchar(255),
	ngaytao date
	
	constraint pk_playlist primary key(maplaylist),
	constraint fk_palylist_users foreign key(matk) references USERS(matk) on delete cascade,
);

create table PLAYLIST_SONG
(
	trackno int identity(1,1),
	maplaylist int,
	mabh varchar(8)

	constraint pk_playlistsong primary key(trackno),
	constraint fk_playlistsong_playlist foreign key(maplaylist) references PLAYLIST(maplaylist) on delete cascade,
	constraint fk_playlistsong_song foreign key(mabh) references SONG(mabh) on delete cascade,
);

-- Insert USERS
insert into USERS(tennd,matkhau,email,ngaysinh,chucvu,ngaytao) values 
('nam','123','s@gmail.com','','1','2022-11-10'),
('bao','123','g@gmail.com','2003-05-12','1','2022-11-10'),
('nhien','123','c@gmail.com','','1','2022-11-10'),
('nguyen van b','123','b@gmail.com','2002-08-20','0','2022-11-10'),
('nguyen van a','123','a@gmail.com','','0','2022-11-10');

-- Insert SONG
-- JAZZ
insert into SONG(mabh,tenbh,theloai,nguoist,nguoitb,anh,musicpath,ngaytao) values
('jazz1',N'Mưa Hồng','jazz',N'Trịnh Công Sơn', N'Lâm Nhã','img','MuaHong-LanNha-1768615.mp3','2022-11-24'),
('jazz2',N'Mười Năm Tình Cũ','jazz',N'Trần Quang Nam', N'Dương Triệu Vũ','img','Muoi-Nam-Tinh-Cu-Duong-Trieu-Vu.mp3','2022-11-24'),
('jazz3',N'Phút Cuối','jazz',N'Lâm Phương', N'Bạch Yến','img','Phut-Cuoi-Bach-Yen.mp3','2022-11-24'),
('jazz4',N'Tình','jazz',N'Không rõ', N'Hồ Ngọc Hà','img','Tinh-Ho-Ngoc-Ha.mp3','2022-11-24'),
('jazz5',N'Going home','jazz',N'Diddy', N'Kenny','img','05-Going-Home-Saxophone-Kenny-G.mp3','2022-11-24'),
('jazz6',N'Don`t cry for me','jazz',N'Argentina - Madonna', N'Argentina - Madonna','img','Don_t Cry For Me Argentina - Madonna.mp3','2022-11-24'),
('jazz7',N'Ảo ảnh','jazz',N'Y Vân', N'Hồ Ngọc Hà','img','AoAnh-HoNgocHa-DucTuan_3uw8v.mp3','2022-11-24');

-- RAP 
insert into SONG(mabh,tenbh,theloai,nguoist,nguoitb,anh,musicpath,ngaytao) values
('RAP1',N'Anh thèm được ngủ','RAP', N'Khói', N'Khói','abc',N'RAP Khói - anh thèm được ngủ.mp3','2022-11-10'),
('RAP2',N'Chỉ còn ta và ta giữa trời','RAP', N'Killic x DBlue', N'Killic x DBlue','abc',N'RAP Chỉ Còn Ta Và Ta Giữa Trời.mp3','2022-11-10'),
('RAP3',N'6locc 6a6y','RAP', N'LilRoad', N'LilRoad','abc',N'RAP 6locc 6a6y.mp3','2022-11-10'),
('RAP4',N'Calling My Phone','RAP', N'Lil Tjay', N'Lil Tjay','abc',N'RAP Calling My Phone.mp3','2022-11-10'),
('RAP5',N'Chỉ một đêm nữa thôi','RAP', N'MCK-Tlinh', N'MCK-Tlinh','abc',N'RAP CHỈ MỘT ĐÊM NỮA THÔI.mp3','2022-11-10'),
('RAP6',N'Thích quá rùi nà','RAP', N'Tlinh x Trung Trần', N'Tlinh x Trung Trần','abc',N'RAP Thích Quá Rùi Nà.mp3','2022-11-10'),
('RAP7',N'Vầng thái dương','RAP', N'YoungH - Bray', N'YoungH - Bray','abc',N'RAP Vầng Thái Dương.mp3','2022-11-10'),
('RAP8',N'XTC','RAP', N'Grovie x Tlinh x MCK', N'Grovie x Tlinh x MCK','abc',N'RAP Xích Thêm Chút.mp3','2022-11-10');

-- GAMEING
insert into SONG(mabh,tenbh,theloai,nguoist,nguoitb,anh,musicpath,ngaytao) values
('GAMING1',N'Playground','GAMING', N'Bea Miller', N'Bea Miller','abc',N'GAMING Playground.mp3','2022-11-10'),
('GAMING2',N'Legends Never Die','GAMING', N'Against The Current', N'Against The Current','abc',N'GAMING Legends Never Die.mp3','2022-11-10'),
('GAMING3',N'Star walkin','GAMING', N'LilNasx', N'LilNasx','abc',N'GAMING STAR WALKIN.mp3','2022-11-10'),
('GAMING4',N'Enemy','GAMING', N'Imagine Dragons x J.I.D ', N'Imagine Dragons x J.I.D ','abc',N'GAMING Enemy.mp3','2022-11-10'),
('GAMING5',N'Nhạc trend','GAMING', N'MaGaming', N'MaGaminh','abc',N'GAMING.mp3','2022-11-10'),
('GAMING6',N'Warriors','GAMING', N'Imagine Dragons', N'Imagine Dragons','abc',N'GAMING Warriors.mp3','2022-11-10'),
('GAMING7',N'Guns for hire','GAMING', N'Alex Seaver of Mako', N'Woodkid','abc',N'GAMING Guns for Hire.mp3','2022-11-10');

-- USUK
insert into SONG(mabh,tenbh,theloai,nguoist,nguoitb,anh,musicpath,ngaytao) values
('USUK1',N'Her','USUK', N'Megan Thee Stallion', N'Heart','','Her_USUK.mp3','2022-11-10'),
('USUK2',N'Hero','USUK', N'Cash Cash', N'Christina Perri','','Hero_USUK.mp3','2022-11-10'),
('USUK3',N'How To Love','USUK', N'Lollipop', N'Lollipop','','HowToLove_USUK.mp3','2022-11-10'),
('USUK4',N'Love yourself','USUK',N'Justin Bieber', N'Justin Bieber','','loveyourself_USUK.mp3','2022-11-10'),
('USUK5',N'Cash Cahs','USUK', N'brothers Jean Paul Makhlouf', N'brothers Jean Paul Makhlouf','','CashCahs_USUK.mp3','2022-11-10'),
('USUK6',N'Lobby','USUK', N'Johannes Moser', N'Light','','Lobby_USUK.mp3','2022-11-10'),
('USUK7',N'We Do not Talk Anymore','USUK', N'Charlie Puth', N'Charlie Puth','','WeDontTalkAnymore_USUK.mp3','2022-11-10'),
('USUK8',N'Shape Of You','USUK', N'Ed Sheeran', N'Ed Sheeran','','ShapeOfYou_USUK.mp3','2022-11-10');

-- SLEEP
insert into SONG(mabh,tenbh,theloai,nguoist,nguoitb,anh,musicpath,ngaytao) values
('sleep1',N'That`s us','sleep','Anson Seabra','Anson Seabra','img','Anson Seabra - That`s Us .mp3','2022-11-25'),
('sleep2',N'Crazier Things','sleep','Chelsea Cutler','Chelsea Cutler(with Noah Kahan)','img','Chelsea Cutler - Crazier Things (with Noah Kahan) .mp3','2022-11-25'),
('sleep3',N' Green tea','sleep','Dane Amar','Dane Amar','img','Dane Amar - Green tea .mp3','2022-11-25'),
('sleep4',N'Looking for something','sleep','marcos g','marcos g','img','marcos g - looking for something.mp3','2022-11-25'),
('sleep5',N'The Simple Things','sleep','Michael Carreon','Michael Carreon','img','Michael Carreon - The Simple Things 「Lyrics」.mp3','2022-11-25'),
('sleep6',N'Death bed','sleep','Powfu','Powfu','img','Powfu - death bed.mp3','2022-11-25'),
('sleep7',N'Don`t Wanna Fall In Love Again','sleep','YAYYOUNG','YAYYOUNG','img','YAYYOUNG - Don`t Wanna Fall In Love Again.mp3','2022-11-25');

-- R&B
insert into SONG(mabh,tenbh,theloai,nguoist,nguoitb,anh,musicpath,ngaytao) values
('R&B',N'All Night Long','R&B', N'Various', N'Various','abc',N'AllNightLong_R&B.mp3','2022-11-10'),
('R&B1',N'Say My Name','R&B', N'David Guetta, Bebe Rexha & J Balvin', N'David Guetta, Bebe Rexha & J Balvin','abc',N'SayMyName_R&B.mp3','2022-11-10'),
('R&B2',N'Too Close','R&B', N'Alex Clare', N'Alex Clare','abc',N'Too Close_R&B.mp3','2022-11-10'),
('R&B3',N'Ty Dolla','R&B', N'Ty Dolla $ign', N'Ty Dolla $ign','abc',N'TyDollaIgn_R&B.mp3','2022-11-10'),
('R&B4',N'Give Me Everything','GAMING', N'Pitbull ft. Neyo, Nayer & Afrojack', N'Pitbull ft. Neyo, Nayer & Afrojack','abc',N'GiveMeEverything_R&B.mp3','2022-11-10');

-- V-POP
insert into SONG(mabh,tenbh,theloai,nguoist,nguoitb,anh,musicpath,ngaytao) values
('V-Pop',N'Chuyện Đôi Ta','V-Pop', N'Emcee L', N'Emcee L','abc',N'ChuyenDoiTa_VPop.mp3','2022-11-10'),
('V-Pop1',N'Bắt Cóc Con Tim','V-Pop', N'Lou Hoàng', N'Lou Hoàng','abc',N'BatCocConTim_VPop.mp3','2022-11-10'),
('V-Pop2',N'Bước Qua Mùa Cô Đơn','V-Pop', N'Vũ', N'Vũ','abc',N'BuocQuaMuaCoDon_VPop.mp3','2022-11-10'),
('V-Pop3',N'Chia Tay','V-Pop', N'Bùi Anh Tuấn', N'Bùi Anh Tuấn','abc',N'ChiaTay_VPop.mp3','2022-11-10'),
('V-Pop4',N'Chúng Ta Của Hiện Tại','V-Pop', N'Sơn Tùng MTP', N'Sơn Tùng MTP','abc',N'SonTung_VPop.mp3','2022-11-10'),
('V-Pop5',N'Tại Vì Sao','V-Pop', N'MCK', N'MCK','abc',N'TaiViSao_VPop.mp3','2022-11-10'),
('V-Pop6',N'Writing for you','V-Pop', N'Mono', N'Mono','abc',N'Monu_VPop.mp3','2022-11-10');

-- HipHop
insert into SONG(mabh,tenbh,theloai,nguoist,nguoitb,anh,musicpath,ngaytao) values
('HipHop',N'Brown Justin Bieber','HipHop', N'Suigeneris', N'Suigeneris','abc',N'HipHop_BrownJustinBieber.mp3','2022-11-10'),
('HipHop1',N'Drug Addicts','HipHop', N'Lil Pump', N'Lil Pump','abc',N'HipHop_Drug Addicts.mp3','2022-11-10'),
('HipHop2',N'French Montana','HipHop', N'French Montana', N'Rae Sremmurd Swae Lee','abc',N'HipHop_French Montana.mp3','2022-11-10'),
('HipHop3',N'HEYHO','HipHop', N'Lumineers.', N'Lumineers.','abc',N'HipHop_HEYHO.mp3','2022-11-10'),
('HipHop4',N'SICKOMODE','HipHop', N'Travis Scott', N'Travis Scott','abc',N'HipHop_SICKOMODE.mp3','2022-11-10');

-- Insert USER_SONG
insert into USER_SONG(matk,mabh,playcount,ngaytao) values
(1,'jazz1',50,'2022-11-24'),
(2,'jazz2',50,'2022-11-24'),
(3,'jazz3',60,'2022-11-24'),
(4,'jazz4',20,'2022-11-24'),
(5,'jazz5',50,'2022-11-24'),
(1,'jazz6',50,'2022-11-24'),
(2,'jazz7',60,'2022-11-24');

insert into USER_SONG(matk,mabh,playcount,ngaytao) values
(3,'RAP1',20,'2022-11-10'),
(4,'RAP2',50,'2022-11-10'),
(5,'RAP3',50,'2022-11-10'),
(1,'RAP4',60,'2022-11-10'),
(2,'RAP5',20,'2022-11-10'),
(3,'RAP6',50,'2022-11-10'),
(4,'RAP7',50,'2022-11-10'),
(5,'RAP8',60,'2022-11-10');

insert into USER_SONG(matk,mabh,playcount,ngaytao) values
(1,'GAMING1',20,'2022-11-10'),
(1,'GAMING2',50,'2022-11-10'),
(2,'GAMING3',50,'2022-11-10'),
(3,'GAMING4',60,'2022-11-10'),
(4,'GAMING5',20,'2022-11-10'),
(5,'GAMING6',20,'2022-11-10'),
(1,'GAMING7',20,'2022-11-10');

insert into USER_SONG(matk,mabh,playcount,ngaytao) values
(1,'USUK1',20,'2022-11-10'),
(2,'USUK2',50,'2022-11-10'),
(3,'USUK3',50,'2022-11-10'),
(4,'USUK4',60,'2022-11-10'),
(5,'USUK5',20,'2022-11-10'),
(1,'USUK6',20,'2022-11-10'),
(4,'USUK7',20,'2022-11-10'),
(1,'USUK8',20,'2022-11-10');

-- Insert PLAYLIST
insert into PLAYLIST(matk,tieude,ngaytao)  values
(1,'mile','2022-11-10'),
(2,'hay ne','2022-11-10'),
(3,'abc','2022-11-10'),
(4,'mlk','2022-11-10'),
(5,'commit','2022-11-10');

-- Insert PLAYLIST_SONG
insert into PLAYLIST_SONG(maplaylist,mabh) values
(1,'jazz1'),
(2,'jazz2'),
(3,'jazz3'),
(4,'jazz4'),
(5,'jazz5'),
(1,'jazz6'),
(1,'jazz7');

insert into PLAYLIST_SONG(maplaylist,mabh) values
(1,'RAP1'),
(2,'RAP2'),
(1,'RAP3'),
(2,'RAP4'),
(3,'RAP5'),
(4,'RAP6'),
(1,'RAP7'),
(5,'RAP8');

insert into PLAYLIST_SONG(maplaylist,mabh) values
(1,'GAMING1'),
(2,'GAMING2'),
(3,'GAMING3'),
(4,'GAMING4'),
(5,'GAMING5'),
(1,'GAMING6'),
(2,'GAMING7');

insert into PLAYLIST_SONG(maplaylist,mabh) values
(1,'USUK1'),
(2,'USUK2'),
(3,'USUK3'),
(2,'USUK4'),
(4,'USUK5'),
(5,'USUK6'),
(2,'USUK7'),
(5,'USUK8');

select top 5 * from song order by ngaytao desc


select * from PLAYLIST_SONG inner join PLAYLIST on PLAYLIST_SONG.maplaylist = PLAYLIST.maplaylist

select tenbh,theloai,nguoist,nguoitb 
from PLAYLIST_SONG inner join SONG on PLAYLIST_SONG.mabh = SONG.mabh 


select * from SONG

SELECT tenbh,theloai,nguoist,nguoitb  FROM PLAYLIST_SONG
inner join SONG on PLAYLIST_SONG.mabh = SONG.mabh 
WHERE maplaylist = 34

go
create proc sp_Top10Nhac
as begin
	select top 10 b.mabh,
	tenbh,
	nguoitb, 
	playcount, 
	b.ngaytao
	from USER_SONG a inner join SONG b 
	on a.mabh=b.mabh order by playcount desc
end
go
create proc sp_fillPlaylistUser @matk int, @count int 
as begin 
	
	select  Song.mabh, Song.tenbh,Song.theloai,Song.nguoist,Song.nguoitb from USERS inner join PLAYLIST on PLAYLIST.matk = USERS.matk
										inner join  PLAYLIST_SONG on PLAYLIST.maplaylist = PLAYLIST_SONG.maplaylist
										inner join SONG on PLAYLIST_SONG.mabh = SONG.mabh
							where PLAYLIST.matk = @matk and PLAYLIST .counts = @count
end

exec sp_fillPlaylistUser 1,2