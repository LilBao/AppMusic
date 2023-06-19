select COUNT(counts) from PLAYLIST inner join USERS on PLAYLIST.matk = USERS.matk where PLAYLIST.matk = 3

select counts,tieude,descriptions,tennd,PLAYLIST.hinh from PLAYLIST inner join USERS on PLAYLIST.matk = USERS.matk where PLAYLIST.matk = 3

select * from USERS inner join PLAYLIST on USERS.matk = PLAYLIST.matk 

select PLAYLIST.maplaylist, mabh from USERS inner join PLAYLIST on USERS.matk = PLAYLIST.matk 
					inner join PLAYLIST_SONG on PLAYLIST.maplaylist = PLAYLIST_SONG.maplaylist where PLAYLIST_SONG.maplaylist = 15
				  

select * from PLAYLIST 
					inner join PLAYLIST_SONG on PLAYLIST.maplaylist = PLAYLIST_SONG.maplaylist

select  Song.mabh, Song.tenbh,Song.theloai,Song.nguoist,Song.nguoitb, PLAYLIST.maplaylist
from  SONG inner join  PLAYLIST_SONG on PLAYLIST_SONG.mabh = SONG.mabh 
			inner join  PLAYLIST on PLAYLIST.maplaylist = PLAYLIST_SONG.maplaylist
			inner join users on USERS.matk = PLAYLIST.matk where USERS.matk = 1


select  Song.mabh, Song.tenbh,Song.theloai,Song.nguoist,Song.nguoitb
from  SONG inner join  PLAYLIST_SONG on PLAYLIST_SONG.mabh = SONG.mabh 
			inner join  PLAYLIST on PLAYLIST.maplaylist = PLAYLIST_SONG.maplaylist
			inner join users on USERS.matk = PLAYLIST.matk where USERS.matk = 1 


select PLAYLIST.maplaylist, counts from PLAYLIST
	inner join  PLAYLIST_SONG on PLAYLIST.maplaylist = PLAYLIST_SONG.maplaylist where  PLAYLIST.maplaylist = 44
									
select PLAYLIST.maplaylist, mabh from USERS inner join PLAYLIST on USERS.matk = PLAYLIST.matk 
	inner join PLAYLIST_SONG on PLAYLIST.maplaylist = PLAYLIST_SONG.maplaylist where PLAYLIST_SONG.maplaylist = 44

	select tennd,tieude ,USERS.matk,counts,maplaylist from USERS inner join PLAYLIST on USERS.matk = PLAYLIST.matk
		where USERS.matk = 1 

	select tennd,tieude ,USERS.matk,counts,maplaylist from USERS inner join PLAYLIST on USERS.matk = PLAYLIST.matk
	where  PLAYLIST.maplaylist = 15

	select  Song.mabh, Song.tenbh,Song.theloai,Song.nguoist,Song.nguoitb from USERS inner join PLAYLIST on PLAYLIST.matk = USERS.matk
										inner join  PLAYLIST_SONG on PLAYLIST.maplaylist = PLAYLIST_SONG.maplaylist
										inner join SONG on PLAYLIST_SONG.mabh = SONG.mabh
							where PLAYLIST.matk = 1 and PLAYLIST .counts = 2
select USERS.matk,counts,maplaylist from USERS inner join PLAYLIST on USERS.matk = PLAYLIST.matk
               	where PLAYLIST.matk = 1 and PLAYLIST .counts = 2
		select *from PLAYLIST_SONG

	UPDATE PLAYLIST SET tieude = N'PlayList 1', hinh =null, descriptions = 'Nam pro'  WHERE maplaylist = 15 and counts = 1

	select counts,maplaylist from PLAYLIST inner join USERS on PLAYLIST.matk = USERS.matk where PLAYLIST.matk = 1 and maplaylist = 15
	
	select counts from PLAYLIST inner join USERS on PLAYLIST.matk = USERS.matk where PLAYLIST.matk = 1
	DELETE FROM PLAYLIST_SONG WHERE mabh like N'GAMING1' and maplaylist = 15