# 2022_05_19-torpedo
konzolon kell elkészíteni 1 db játékos játszik a gép ellen 1 db 7 elemű pályánk van ahol a gép is elhelyez 1 db 3 elemű hajót amit a játékosnak el kell süllyesztenie

legenerálunk 7 vonalat *-val jelöli meg ha talált #-val ha nem talált

generalas(): legenerál 7 vonalat

hajo_helyzet(): van maga a 7 vonal, abból sor szerint 1-7 abból választunk 3db sorozatot és így választja ki a hajónak a helyzetét ellenőrizze le, hogyha olyan random sorozatot ad ami egymás után következik akkor fogadja el, ha nem akkor generáljon újat

szambeker(): bekér egy számot 1-7-ig, ha nagyobb mint 7 vagy kisebb mint 1 akkor kérje be újra ha 1 és 7 között talál 1 jelölt számot akkor írja ki a *-ot, ha nem akkor #-t

metódus egy vonal alap értéke 0, és ha hajó van rajta akkor ez az érték 1 lesz
