package com.dake.foorballapps.data.source.local;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.dake.foorballapps.data.source.local.subset.FavoriteCount;
import com.dake.foorballapps.vo.FavoriteMatch;
import com.dake.foorballapps.vo.FavoriteTeam;
import com.dake.foorballapps.vo.Match;
import com.dake.foorballapps.vo.Player;
import com.dake.foorballapps.vo.Team;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings("unchecked")
public final class SportDao_Impl implements SportDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfMatch;

  private final EntityInsertionAdapter __insertionAdapterOfTeam;

  private final EntityInsertionAdapter __insertionAdapterOfPlayer;

  private final EntityInsertionAdapter __insertionAdapterOfFavoriteMatch;

  private final EntityInsertionAdapter __insertionAdapterOfFavoriteTeam;

  private final SharedSQLiteStatement __preparedStmtOfDeleteNextMatches;

  private final SharedSQLiteStatement __preparedStmtOfDeletePrevMatches;

  private final SharedSQLiteStatement __preparedStmtOfDeleteFavoriteMatch;

  private final SharedSQLiteStatement __preparedStmtOfDeleteFavoriteTeam;

  public SportDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMatch = new EntityInsertionAdapter<Match>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `matches`(`matchType`,`idEvent`,`dateEvent`,`idAwayTeam`,`idHomeTeam`,`idLeague`,`idSoccerXML`,`intAwayScore`,`intAwayShots`,`intHomeScore`,`intHomeShots`,`intRound`,`intSpectators`,`strAwayFormation`,`strAwayGoalDetails`,`strAwayLineupDefense`,`strAwayLineupForward`,`strAwayLineupGoalkeeper`,`strAwayLineupMidfield`,`strAwayLineupSubstitutes`,`strAwayRedCards`,`strAwayTeam`,`strAwayYellowCards`,`strBanner`,`strCircuit`,`strCity`,`strCountry`,`strDate`,`strDescriptionEN`,`strEvent`,`strFanart`,`strFilename`,`strHomeFormation`,`strHomeGoalDetails`,`strHomeLineupDefense`,`strHomeLineupForward`,`strHomeLineupGoalkeeper`,`strHomeLineupMidfield`,`strHomeLineupSubstitutes`,`strHomeRedCards`,`strHomeTeam`,`strHomeYellowCards`,`strLeague`,`strLocked`,`strMap`,`strPoster`,`strResult`,`strSeason`,`strSport`,`strTVStation`,`strThumb`,`strTime`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Match value) {
        if (value.getMatchType() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getMatchType());
        }
        if (value.getIdEvent() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getIdEvent());
        }
        if (value.getDateEvent() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDateEvent());
        }
        if (value.getIdAwayTeam() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getIdAwayTeam());
        }
        if (value.getIdHomeTeam() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getIdHomeTeam());
        }
        if (value.getIdLeague() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getIdLeague());
        }
        if (value.getIdSoccerXML() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getIdSoccerXML());
        }
        if (value.getIntAwayScore() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getIntAwayScore());
        }
        if (value.getIntAwayShots() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getIntAwayShots());
        }
        if (value.getIntHomeScore() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getIntHomeScore());
        }
        if (value.getIntHomeShots() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getIntHomeShots());
        }
        if (value.getIntRound() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getIntRound());
        }
        if (value.getIntSpectators() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getIntSpectators());
        }
        if (value.getStrAwayFormation() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getStrAwayFormation());
        }
        if (value.getStrAwayGoalDetails() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getStrAwayGoalDetails());
        }
        if (value.getStrAwayLineupDefense() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getStrAwayLineupDefense());
        }
        if (value.getStrAwayLineupForward() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getStrAwayLineupForward());
        }
        if (value.getStrAwayLineupGoalkeeper() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getStrAwayLineupGoalkeeper());
        }
        if (value.getStrAwayLineupMidfield() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getStrAwayLineupMidfield());
        }
        if (value.getStrAwayLineupSubstitutes() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getStrAwayLineupSubstitutes());
        }
        if (value.getStrAwayRedCards() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getStrAwayRedCards());
        }
        if (value.getStrAwayTeam() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getStrAwayTeam());
        }
        if (value.getStrAwayYellowCards() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getStrAwayYellowCards());
        }
        if (value.getStrBanner() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getStrBanner());
        }
        if (value.getStrCircuit() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getStrCircuit());
        }
        if (value.getStrCity() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getStrCity());
        }
        if (value.getStrCountry() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getStrCountry());
        }
        if (value.getStrDate() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getStrDate());
        }
        if (value.getStrDescriptionEN() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getStrDescriptionEN());
        }
        if (value.getStrEvent() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getStrEvent());
        }
        if (value.getStrFanart() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getStrFanart());
        }
        if (value.getStrFilename() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getStrFilename());
        }
        if (value.getStrHomeFormation() == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.getStrHomeFormation());
        }
        if (value.getStrHomeGoalDetails() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.getStrHomeGoalDetails());
        }
        if (value.getStrHomeLineupDefense() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getStrHomeLineupDefense());
        }
        if (value.getStrHomeLineupForward() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getStrHomeLineupForward());
        }
        if (value.getStrHomeLineupGoalkeeper() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getStrHomeLineupGoalkeeper());
        }
        if (value.getStrHomeLineupMidfield() == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.getStrHomeLineupMidfield());
        }
        if (value.getStrHomeLineupSubstitutes() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getStrHomeLineupSubstitutes());
        }
        if (value.getStrHomeRedCards() == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, value.getStrHomeRedCards());
        }
        if (value.getStrHomeTeam() == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.getStrHomeTeam());
        }
        if (value.getStrHomeYellowCards() == null) {
          stmt.bindNull(42);
        } else {
          stmt.bindString(42, value.getStrHomeYellowCards());
        }
        if (value.getStrLeague() == null) {
          stmt.bindNull(43);
        } else {
          stmt.bindString(43, value.getStrLeague());
        }
        if (value.getStrLocked() == null) {
          stmt.bindNull(44);
        } else {
          stmt.bindString(44, value.getStrLocked());
        }
        if (value.getStrMap() == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindString(45, value.getStrMap());
        }
        if (value.getStrPoster() == null) {
          stmt.bindNull(46);
        } else {
          stmt.bindString(46, value.getStrPoster());
        }
        if (value.getStrResult() == null) {
          stmt.bindNull(47);
        } else {
          stmt.bindString(47, value.getStrResult());
        }
        if (value.getStrSeason() == null) {
          stmt.bindNull(48);
        } else {
          stmt.bindString(48, value.getStrSeason());
        }
        if (value.getStrSport() == null) {
          stmt.bindNull(49);
        } else {
          stmt.bindString(49, value.getStrSport());
        }
        if (value.getStrTVStation() == null) {
          stmt.bindNull(50);
        } else {
          stmt.bindString(50, value.getStrTVStation());
        }
        if (value.getStrThumb() == null) {
          stmt.bindNull(51);
        } else {
          stmt.bindString(51, value.getStrThumb());
        }
        if (value.getStrTime() == null) {
          stmt.bindNull(52);
        } else {
          stmt.bindString(52, value.getStrTime());
        }
      }
    };
    this.__insertionAdapterOfTeam = new EntityInsertionAdapter<Team>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `teams`(`idLeague`,`idTeam`,`idSoccerXML`,`intFormedYear`,`intLoved`,`intStadiumCapacity`,`strAlternate`,`strCountry`,`strDescriptionCN`,`strDescriptionDE`,`strDescriptionEN`,`strDescriptionES`,`strDescriptionFR`,`strDescriptionHU`,`strDescriptionIL`,`strDescriptionIT`,`strDescriptionJP`,`strDescriptionNL`,`strDescriptionNO`,`strDescriptionPL`,`strDescriptionPT`,`strDescriptionRU`,`strDescriptionSE`,`strDivision`,`strFacebook`,`strGender`,`strInstagram`,`strKeywords`,`strLeague`,`strLocked`,`strManager`,`strRSS`,`strSport`,`strStadium`,`strStadiumDescription`,`strStadiumLocation`,`strStadiumThumb`,`strTeam`,`strTeamBadge`,`strTeamBanner`,`strTeamFanart1`,`strTeamFanart2`,`strTeamFanart3`,`strTeamFanart4`,`strTeamJersey`,`strTeamLogo`,`strTeamShort`,`strTwitter`,`strWebsite`,`strYoutube`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Team value) {
        if (value.getIdLeague() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getIdLeague());
        }
        if (value.getIdTeam() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getIdTeam());
        }
        if (value.getIdSoccerXML() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getIdSoccerXML());
        }
        if (value.getIntFormedYear() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getIntFormedYear());
        }
        if (value.getIntLoved() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getIntLoved());
        }
        if (value.getIntStadiumCapacity() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getIntStadiumCapacity());
        }
        if (value.getStrAlternate() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getStrAlternate());
        }
        if (value.getStrCountry() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getStrCountry());
        }
        if (value.getStrDescriptionCN() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getStrDescriptionCN());
        }
        if (value.getStrDescriptionDE() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getStrDescriptionDE());
        }
        if (value.getStrDescriptionEN() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getStrDescriptionEN());
        }
        if (value.getStrDescriptionES() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getStrDescriptionES());
        }
        if (value.getStrDescriptionFR() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getStrDescriptionFR());
        }
        if (value.getStrDescriptionHU() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getStrDescriptionHU());
        }
        if (value.getStrDescriptionIL() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getStrDescriptionIL());
        }
        if (value.getStrDescriptionIT() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getStrDescriptionIT());
        }
        if (value.getStrDescriptionJP() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getStrDescriptionJP());
        }
        if (value.getStrDescriptionNL() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getStrDescriptionNL());
        }
        if (value.getStrDescriptionNO() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getStrDescriptionNO());
        }
        if (value.getStrDescriptionPL() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getStrDescriptionPL());
        }
        if (value.getStrDescriptionPT() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getStrDescriptionPT());
        }
        if (value.getStrDescriptionRU() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getStrDescriptionRU());
        }
        if (value.getStrDescriptionSE() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getStrDescriptionSE());
        }
        if (value.getStrDivision() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getStrDivision());
        }
        if (value.getStrFacebook() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getStrFacebook());
        }
        if (value.getStrGender() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getStrGender());
        }
        if (value.getStrInstagram() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getStrInstagram());
        }
        if (value.getStrKeywords() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getStrKeywords());
        }
        if (value.getStrLeague() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getStrLeague());
        }
        if (value.getStrLocked() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getStrLocked());
        }
        if (value.getStrManager() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getStrManager());
        }
        if (value.getStrRSS() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getStrRSS());
        }
        if (value.getStrSport() == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.getStrSport());
        }
        if (value.getStrStadium() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.getStrStadium());
        }
        if (value.getStrStadiumDescription() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getStrStadiumDescription());
        }
        if (value.getStrStadiumLocation() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getStrStadiumLocation());
        }
        if (value.getStrStadiumThumb() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getStrStadiumThumb());
        }
        if (value.getStrTeam() == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.getStrTeam());
        }
        if (value.getStrTeamBadge() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getStrTeamBadge());
        }
        if (value.getStrTeamBanner() == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, value.getStrTeamBanner());
        }
        if (value.getStrTeamFanart1() == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.getStrTeamFanart1());
        }
        if (value.getStrTeamFanart2() == null) {
          stmt.bindNull(42);
        } else {
          stmt.bindString(42, value.getStrTeamFanart2());
        }
        if (value.getStrTeamFanart3() == null) {
          stmt.bindNull(43);
        } else {
          stmt.bindString(43, value.getStrTeamFanart3());
        }
        if (value.getStrTeamFanart4() == null) {
          stmt.bindNull(44);
        } else {
          stmt.bindString(44, value.getStrTeamFanart4());
        }
        if (value.getStrTeamJersey() == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindString(45, value.getStrTeamJersey());
        }
        if (value.getStrTeamLogo() == null) {
          stmt.bindNull(46);
        } else {
          stmt.bindString(46, value.getStrTeamLogo());
        }
        if (value.getStrTeamShort() == null) {
          stmt.bindNull(47);
        } else {
          stmt.bindString(47, value.getStrTeamShort());
        }
        if (value.getStrTwitter() == null) {
          stmt.bindNull(48);
        } else {
          stmt.bindString(48, value.getStrTwitter());
        }
        if (value.getStrWebsite() == null) {
          stmt.bindNull(49);
        } else {
          stmt.bindString(49, value.getStrWebsite());
        }
        if (value.getStrYoutube() == null) {
          stmt.bindNull(50);
        } else {
          stmt.bindString(50, value.getStrYoutube());
        }
      }
    };
    this.__insertionAdapterOfPlayer = new EntityInsertionAdapter<Player>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `players`(`idPlayer`,`idTeam`,`dateBorn`,`dateSigned`,`idPlayerManager`,`idSoccerXML`,`intLoved`,`intSoccerXMLTeamID`,`strBanner`,`strBirthLocation`,`strCollege`,`strCutout`,`strDescriptionCN`,`strDescriptionDE`,`strDescriptionEN`,`strDescriptionES`,`strDescriptionFR`,`strDescriptionHU`,`strDescriptionIL`,`strDescriptionIT`,`strDescriptionJP`,`strDescriptionNL`,`strDescriptionNO`,`strDescriptionPL`,`strDescriptionPT`,`strDescriptionRU`,`strDescriptionSE`,`strFacebook`,`strFanart1`,`strFanart2`,`strFanart3`,`strFanart4`,`strGender`,`strHeight`,`strInstagram`,`strLocked`,`strNationality`,`strPlayer`,`strPosition`,`strSigning`,`strSport`,`strTeam`,`strThumb`,`strTwitter`,`strWage`,`strWebsite`,`strWeight`,`strYoutube`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Player value) {
        if (value.getIdPlayer() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getIdPlayer());
        }
        if (value.getIdTeam() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getIdTeam());
        }
        if (value.getDateBorn() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDateBorn());
        }
        if (value.getDateSigned() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDateSigned());
        }
        if (value.getIdPlayerManager() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getIdPlayerManager());
        }
        if (value.getIdSoccerXML() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getIdSoccerXML());
        }
        if (value.getIntLoved() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getIntLoved());
        }
        if (value.getIntSoccerXMLTeamID() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getIntSoccerXMLTeamID());
        }
        if (value.getStrBanner() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getStrBanner());
        }
        if (value.getStrBirthLocation() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getStrBirthLocation());
        }
        if (value.getStrCollege() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getStrCollege());
        }
        if (value.getStrCutout() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getStrCutout());
        }
        if (value.getStrDescriptionCN() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getStrDescriptionCN());
        }
        if (value.getStrDescriptionDE() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getStrDescriptionDE());
        }
        if (value.getStrDescriptionEN() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getStrDescriptionEN());
        }
        if (value.getStrDescriptionES() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getStrDescriptionES());
        }
        if (value.getStrDescriptionFR() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getStrDescriptionFR());
        }
        if (value.getStrDescriptionHU() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getStrDescriptionHU());
        }
        if (value.getStrDescriptionIL() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getStrDescriptionIL());
        }
        if (value.getStrDescriptionIT() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getStrDescriptionIT());
        }
        if (value.getStrDescriptionJP() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getStrDescriptionJP());
        }
        if (value.getStrDescriptionNL() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getStrDescriptionNL());
        }
        if (value.getStrDescriptionNO() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getStrDescriptionNO());
        }
        if (value.getStrDescriptionPL() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getStrDescriptionPL());
        }
        if (value.getStrDescriptionPT() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getStrDescriptionPT());
        }
        if (value.getStrDescriptionRU() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getStrDescriptionRU());
        }
        if (value.getStrDescriptionSE() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getStrDescriptionSE());
        }
        if (value.getStrFacebook() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getStrFacebook());
        }
        if (value.getStrFanart1() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getStrFanart1());
        }
        if (value.getStrFanart2() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getStrFanart2());
        }
        if (value.getStrFanart3() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getStrFanart3());
        }
        if (value.getStrFanart4() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getStrFanart4());
        }
        if (value.getStrGender() == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.getStrGender());
        }
        if (value.getStrHeight() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.getStrHeight());
        }
        if (value.getStrInstagram() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getStrInstagram());
        }
        if (value.getStrLocked() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getStrLocked());
        }
        if (value.getStrNationality() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getStrNationality());
        }
        if (value.getStrPlayer() == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.getStrPlayer());
        }
        if (value.getStrPosition() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getStrPosition());
        }
        if (value.getStrSigning() == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, value.getStrSigning());
        }
        if (value.getStrSport() == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.getStrSport());
        }
        if (value.getStrTeam() == null) {
          stmt.bindNull(42);
        } else {
          stmt.bindString(42, value.getStrTeam());
        }
        if (value.getStrThumb() == null) {
          stmt.bindNull(43);
        } else {
          stmt.bindString(43, value.getStrThumb());
        }
        if (value.getStrTwitter() == null) {
          stmt.bindNull(44);
        } else {
          stmt.bindString(44, value.getStrTwitter());
        }
        if (value.getStrWage() == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindString(45, value.getStrWage());
        }
        if (value.getStrWebsite() == null) {
          stmt.bindNull(46);
        } else {
          stmt.bindString(46, value.getStrWebsite());
        }
        if (value.getStrWeight() == null) {
          stmt.bindNull(47);
        } else {
          stmt.bindString(47, value.getStrWeight());
        }
        if (value.getStrYoutube() == null) {
          stmt.bindNull(48);
        } else {
          stmt.bindString(48, value.getStrYoutube());
        }
      }
    };
    this.__insertionAdapterOfFavoriteMatch = new EntityInsertionAdapter<FavoriteMatch>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `favorite_matches`(`idMatch`) VALUES (?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavoriteMatch value) {
        if (value.getIdMatch() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getIdMatch());
        }
      }
    };
    this.__insertionAdapterOfFavoriteTeam = new EntityInsertionAdapter<FavoriteTeam>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `favorite_teams`(`idTeam`) VALUES (?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavoriteTeam value) {
        if (value.getIdTeam() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getIdTeam());
        }
      }
    };
    this.__preparedStmtOfDeleteNextMatches = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM matches WHERE matchType = 'type_next_match' AND idLeague = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeletePrevMatches = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM matches WHERE matchType = 'type_prev_match' AND idLeague = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteFavoriteMatch = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM favorite_matches WHERE idMatch = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteFavoriteTeam = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM favorite_teams WHERE idTeam = ?";
        return _query;
      }
    };
  }

  @Override
  public void saveMatches(final List<Match> matches) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfMatch.insert(matches);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void saveTeams(final List<Team> it) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfTeam.insert(it);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void savePlayers(final List<Player> players) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfPlayer.insert(players);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void addToFavoriteMatch(final FavoriteMatch favMatch) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfFavoriteMatch.insert(favMatch);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void addToFavoriteTeam(final FavoriteTeam favoriteTeam) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfFavoriteTeam.insert(favoriteTeam);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteNextMatches(final String idLeague) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteNextMatches.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (idLeague == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, idLeague);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteNextMatches.release(_stmt);
    }
  }

  @Override
  public void deletePrevMatches(final String idLeague) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeletePrevMatches.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (idLeague == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, idLeague);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeletePrevMatches.release(_stmt);
    }
  }

  @Override
  public void deleteFavoriteMatch(final String matchId) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteFavoriteMatch.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (matchId == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, matchId);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteFavoriteMatch.release(_stmt);
    }
  }

  @Override
  public void deleteFavoriteTeam(final String teamId) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteFavoriteTeam.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (teamId == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, teamId);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteFavoriteTeam.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Match>> getNextMatches(final String idLeague) {
    final String _sql = "SELECT * FROM matches WHERE idLeague = ? AND matchType = 'type_next_match' ORDER BY dateEvent DESC LIMIT 15";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (idLeague == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, idLeague);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"matches"}, new Callable<List<Match>>() {
      @Override
      public List<Match> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfMatchType = CursorUtil.getColumnIndexOrThrow(_cursor, "matchType");
          final int _cursorIndexOfIdEvent = CursorUtil.getColumnIndexOrThrow(_cursor, "idEvent");
          final int _cursorIndexOfDateEvent = CursorUtil.getColumnIndexOrThrow(_cursor, "dateEvent");
          final int _cursorIndexOfIdAwayTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "idAwayTeam");
          final int _cursorIndexOfIdHomeTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "idHomeTeam");
          final int _cursorIndexOfIdLeague = CursorUtil.getColumnIndexOrThrow(_cursor, "idLeague");
          final int _cursorIndexOfIdSoccerXML = CursorUtil.getColumnIndexOrThrow(_cursor, "idSoccerXML");
          final int _cursorIndexOfIntAwayScore = CursorUtil.getColumnIndexOrThrow(_cursor, "intAwayScore");
          final int _cursorIndexOfIntAwayShots = CursorUtil.getColumnIndexOrThrow(_cursor, "intAwayShots");
          final int _cursorIndexOfIntHomeScore = CursorUtil.getColumnIndexOrThrow(_cursor, "intHomeScore");
          final int _cursorIndexOfIntHomeShots = CursorUtil.getColumnIndexOrThrow(_cursor, "intHomeShots");
          final int _cursorIndexOfIntRound = CursorUtil.getColumnIndexOrThrow(_cursor, "intRound");
          final int _cursorIndexOfIntSpectators = CursorUtil.getColumnIndexOrThrow(_cursor, "intSpectators");
          final int _cursorIndexOfStrAwayFormation = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayFormation");
          final int _cursorIndexOfStrAwayGoalDetails = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayGoalDetails");
          final int _cursorIndexOfStrAwayLineupDefense = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupDefense");
          final int _cursorIndexOfStrAwayLineupForward = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupForward");
          final int _cursorIndexOfStrAwayLineupGoalkeeper = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupGoalkeeper");
          final int _cursorIndexOfStrAwayLineupMidfield = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupMidfield");
          final int _cursorIndexOfStrAwayLineupSubstitutes = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupSubstitutes");
          final int _cursorIndexOfStrAwayRedCards = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayRedCards");
          final int _cursorIndexOfStrAwayTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayTeam");
          final int _cursorIndexOfStrAwayYellowCards = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayYellowCards");
          final int _cursorIndexOfStrBanner = CursorUtil.getColumnIndexOrThrow(_cursor, "strBanner");
          final int _cursorIndexOfStrCircuit = CursorUtil.getColumnIndexOrThrow(_cursor, "strCircuit");
          final int _cursorIndexOfStrCity = CursorUtil.getColumnIndexOrThrow(_cursor, "strCity");
          final int _cursorIndexOfStrCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "strCountry");
          final int _cursorIndexOfStrDate = CursorUtil.getColumnIndexOrThrow(_cursor, "strDate");
          final int _cursorIndexOfStrDescriptionEN = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionEN");
          final int _cursorIndexOfStrEvent = CursorUtil.getColumnIndexOrThrow(_cursor, "strEvent");
          final int _cursorIndexOfStrFanart = CursorUtil.getColumnIndexOrThrow(_cursor, "strFanart");
          final int _cursorIndexOfStrFilename = CursorUtil.getColumnIndexOrThrow(_cursor, "strFilename");
          final int _cursorIndexOfStrHomeFormation = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeFormation");
          final int _cursorIndexOfStrHomeGoalDetails = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeGoalDetails");
          final int _cursorIndexOfStrHomeLineupDefense = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupDefense");
          final int _cursorIndexOfStrHomeLineupForward = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupForward");
          final int _cursorIndexOfStrHomeLineupGoalkeeper = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupGoalkeeper");
          final int _cursorIndexOfStrHomeLineupMidfield = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupMidfield");
          final int _cursorIndexOfStrHomeLineupSubstitutes = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupSubstitutes");
          final int _cursorIndexOfStrHomeRedCards = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeRedCards");
          final int _cursorIndexOfStrHomeTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeTeam");
          final int _cursorIndexOfStrHomeYellowCards = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeYellowCards");
          final int _cursorIndexOfStrLeague = CursorUtil.getColumnIndexOrThrow(_cursor, "strLeague");
          final int _cursorIndexOfStrLocked = CursorUtil.getColumnIndexOrThrow(_cursor, "strLocked");
          final int _cursorIndexOfStrMap = CursorUtil.getColumnIndexOrThrow(_cursor, "strMap");
          final int _cursorIndexOfStrPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "strPoster");
          final int _cursorIndexOfStrResult = CursorUtil.getColumnIndexOrThrow(_cursor, "strResult");
          final int _cursorIndexOfStrSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "strSeason");
          final int _cursorIndexOfStrSport = CursorUtil.getColumnIndexOrThrow(_cursor, "strSport");
          final int _cursorIndexOfStrTVStation = CursorUtil.getColumnIndexOrThrow(_cursor, "strTVStation");
          final int _cursorIndexOfStrThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "strThumb");
          final int _cursorIndexOfStrTime = CursorUtil.getColumnIndexOrThrow(_cursor, "strTime");
          final List<Match> _result = new ArrayList<Match>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Match _item;
            final String _tmpIdEvent;
            _tmpIdEvent = _cursor.getString(_cursorIndexOfIdEvent);
            final String _tmpDateEvent;
            _tmpDateEvent = _cursor.getString(_cursorIndexOfDateEvent);
            final String _tmpIdAwayTeam;
            _tmpIdAwayTeam = _cursor.getString(_cursorIndexOfIdAwayTeam);
            final String _tmpIdHomeTeam;
            _tmpIdHomeTeam = _cursor.getString(_cursorIndexOfIdHomeTeam);
            final String _tmpIdLeague;
            _tmpIdLeague = _cursor.getString(_cursorIndexOfIdLeague);
            final String _tmpIdSoccerXML;
            _tmpIdSoccerXML = _cursor.getString(_cursorIndexOfIdSoccerXML);
            final String _tmpIntAwayScore;
            _tmpIntAwayScore = _cursor.getString(_cursorIndexOfIntAwayScore);
            final String _tmpIntAwayShots;
            _tmpIntAwayShots = _cursor.getString(_cursorIndexOfIntAwayShots);
            final String _tmpIntHomeScore;
            _tmpIntHomeScore = _cursor.getString(_cursorIndexOfIntHomeScore);
            final String _tmpIntHomeShots;
            _tmpIntHomeShots = _cursor.getString(_cursorIndexOfIntHomeShots);
            final String _tmpIntRound;
            _tmpIntRound = _cursor.getString(_cursorIndexOfIntRound);
            final String _tmpIntSpectators;
            _tmpIntSpectators = _cursor.getString(_cursorIndexOfIntSpectators);
            final String _tmpStrAwayFormation;
            _tmpStrAwayFormation = _cursor.getString(_cursorIndexOfStrAwayFormation);
            final String _tmpStrAwayGoalDetails;
            _tmpStrAwayGoalDetails = _cursor.getString(_cursorIndexOfStrAwayGoalDetails);
            final String _tmpStrAwayLineupDefense;
            _tmpStrAwayLineupDefense = _cursor.getString(_cursorIndexOfStrAwayLineupDefense);
            final String _tmpStrAwayLineupForward;
            _tmpStrAwayLineupForward = _cursor.getString(_cursorIndexOfStrAwayLineupForward);
            final String _tmpStrAwayLineupGoalkeeper;
            _tmpStrAwayLineupGoalkeeper = _cursor.getString(_cursorIndexOfStrAwayLineupGoalkeeper);
            final String _tmpStrAwayLineupMidfield;
            _tmpStrAwayLineupMidfield = _cursor.getString(_cursorIndexOfStrAwayLineupMidfield);
            final String _tmpStrAwayLineupSubstitutes;
            _tmpStrAwayLineupSubstitutes = _cursor.getString(_cursorIndexOfStrAwayLineupSubstitutes);
            final String _tmpStrAwayRedCards;
            _tmpStrAwayRedCards = _cursor.getString(_cursorIndexOfStrAwayRedCards);
            final String _tmpStrAwayTeam;
            _tmpStrAwayTeam = _cursor.getString(_cursorIndexOfStrAwayTeam);
            final String _tmpStrAwayYellowCards;
            _tmpStrAwayYellowCards = _cursor.getString(_cursorIndexOfStrAwayYellowCards);
            final String _tmpStrBanner;
            _tmpStrBanner = _cursor.getString(_cursorIndexOfStrBanner);
            final String _tmpStrCircuit;
            _tmpStrCircuit = _cursor.getString(_cursorIndexOfStrCircuit);
            final String _tmpStrCity;
            _tmpStrCity = _cursor.getString(_cursorIndexOfStrCity);
            final String _tmpStrCountry;
            _tmpStrCountry = _cursor.getString(_cursorIndexOfStrCountry);
            final String _tmpStrDate;
            _tmpStrDate = _cursor.getString(_cursorIndexOfStrDate);
            final String _tmpStrDescriptionEN;
            _tmpStrDescriptionEN = _cursor.getString(_cursorIndexOfStrDescriptionEN);
            final String _tmpStrEvent;
            _tmpStrEvent = _cursor.getString(_cursorIndexOfStrEvent);
            final String _tmpStrFanart;
            _tmpStrFanart = _cursor.getString(_cursorIndexOfStrFanart);
            final String _tmpStrFilename;
            _tmpStrFilename = _cursor.getString(_cursorIndexOfStrFilename);
            final String _tmpStrHomeFormation;
            _tmpStrHomeFormation = _cursor.getString(_cursorIndexOfStrHomeFormation);
            final String _tmpStrHomeGoalDetails;
            _tmpStrHomeGoalDetails = _cursor.getString(_cursorIndexOfStrHomeGoalDetails);
            final String _tmpStrHomeLineupDefense;
            _tmpStrHomeLineupDefense = _cursor.getString(_cursorIndexOfStrHomeLineupDefense);
            final String _tmpStrHomeLineupForward;
            _tmpStrHomeLineupForward = _cursor.getString(_cursorIndexOfStrHomeLineupForward);
            final String _tmpStrHomeLineupGoalkeeper;
            _tmpStrHomeLineupGoalkeeper = _cursor.getString(_cursorIndexOfStrHomeLineupGoalkeeper);
            final String _tmpStrHomeLineupMidfield;
            _tmpStrHomeLineupMidfield = _cursor.getString(_cursorIndexOfStrHomeLineupMidfield);
            final String _tmpStrHomeLineupSubstitutes;
            _tmpStrHomeLineupSubstitutes = _cursor.getString(_cursorIndexOfStrHomeLineupSubstitutes);
            final String _tmpStrHomeRedCards;
            _tmpStrHomeRedCards = _cursor.getString(_cursorIndexOfStrHomeRedCards);
            final String _tmpStrHomeTeam;
            _tmpStrHomeTeam = _cursor.getString(_cursorIndexOfStrHomeTeam);
            final String _tmpStrHomeYellowCards;
            _tmpStrHomeYellowCards = _cursor.getString(_cursorIndexOfStrHomeYellowCards);
            final String _tmpStrLeague;
            _tmpStrLeague = _cursor.getString(_cursorIndexOfStrLeague);
            final String _tmpStrLocked;
            _tmpStrLocked = _cursor.getString(_cursorIndexOfStrLocked);
            final String _tmpStrMap;
            _tmpStrMap = _cursor.getString(_cursorIndexOfStrMap);
            final String _tmpStrPoster;
            _tmpStrPoster = _cursor.getString(_cursorIndexOfStrPoster);
            final String _tmpStrResult;
            _tmpStrResult = _cursor.getString(_cursorIndexOfStrResult);
            final String _tmpStrSeason;
            _tmpStrSeason = _cursor.getString(_cursorIndexOfStrSeason);
            final String _tmpStrSport;
            _tmpStrSport = _cursor.getString(_cursorIndexOfStrSport);
            final String _tmpStrTVStation;
            _tmpStrTVStation = _cursor.getString(_cursorIndexOfStrTVStation);
            final String _tmpStrThumb;
            _tmpStrThumb = _cursor.getString(_cursorIndexOfStrThumb);
            final String _tmpStrTime;
            _tmpStrTime = _cursor.getString(_cursorIndexOfStrTime);
            _item = new Match(_tmpIdEvent,_tmpDateEvent,_tmpIdAwayTeam,_tmpIdHomeTeam,_tmpIdLeague,_tmpIdSoccerXML,_tmpIntAwayScore,_tmpIntAwayShots,_tmpIntHomeScore,_tmpIntHomeShots,_tmpIntRound,_tmpIntSpectators,_tmpStrAwayFormation,_tmpStrAwayGoalDetails,_tmpStrAwayLineupDefense,_tmpStrAwayLineupForward,_tmpStrAwayLineupGoalkeeper,_tmpStrAwayLineupMidfield,_tmpStrAwayLineupSubstitutes,_tmpStrAwayRedCards,_tmpStrAwayTeam,_tmpStrAwayYellowCards,_tmpStrBanner,_tmpStrCircuit,_tmpStrCity,_tmpStrCountry,_tmpStrDate,_tmpStrDescriptionEN,_tmpStrEvent,_tmpStrFanart,_tmpStrFilename,_tmpStrHomeFormation,_tmpStrHomeGoalDetails,_tmpStrHomeLineupDefense,_tmpStrHomeLineupForward,_tmpStrHomeLineupGoalkeeper,_tmpStrHomeLineupMidfield,_tmpStrHomeLineupSubstitutes,_tmpStrHomeRedCards,_tmpStrHomeTeam,_tmpStrHomeYellowCards,_tmpStrLeague,_tmpStrLocked,_tmpStrMap,_tmpStrPoster,_tmpStrResult,_tmpStrSeason,_tmpStrSport,_tmpStrTVStation,_tmpStrThumb,_tmpStrTime);
            final String _tmpMatchType;
            _tmpMatchType = _cursor.getString(_cursorIndexOfMatchType);
            _item.setMatchType(_tmpMatchType);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Match>> getPrevMatches(final String idLeague) {
    final String _sql = "SELECT * FROM matches WHERE idLeague = ? AND matchType = 'type_prev_match' ORDER BY dateEvent DESC LIMIT 15";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (idLeague == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, idLeague);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"matches"}, new Callable<List<Match>>() {
      @Override
      public List<Match> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfMatchType = CursorUtil.getColumnIndexOrThrow(_cursor, "matchType");
          final int _cursorIndexOfIdEvent = CursorUtil.getColumnIndexOrThrow(_cursor, "idEvent");
          final int _cursorIndexOfDateEvent = CursorUtil.getColumnIndexOrThrow(_cursor, "dateEvent");
          final int _cursorIndexOfIdAwayTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "idAwayTeam");
          final int _cursorIndexOfIdHomeTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "idHomeTeam");
          final int _cursorIndexOfIdLeague = CursorUtil.getColumnIndexOrThrow(_cursor, "idLeague");
          final int _cursorIndexOfIdSoccerXML = CursorUtil.getColumnIndexOrThrow(_cursor, "idSoccerXML");
          final int _cursorIndexOfIntAwayScore = CursorUtil.getColumnIndexOrThrow(_cursor, "intAwayScore");
          final int _cursorIndexOfIntAwayShots = CursorUtil.getColumnIndexOrThrow(_cursor, "intAwayShots");
          final int _cursorIndexOfIntHomeScore = CursorUtil.getColumnIndexOrThrow(_cursor, "intHomeScore");
          final int _cursorIndexOfIntHomeShots = CursorUtil.getColumnIndexOrThrow(_cursor, "intHomeShots");
          final int _cursorIndexOfIntRound = CursorUtil.getColumnIndexOrThrow(_cursor, "intRound");
          final int _cursorIndexOfIntSpectators = CursorUtil.getColumnIndexOrThrow(_cursor, "intSpectators");
          final int _cursorIndexOfStrAwayFormation = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayFormation");
          final int _cursorIndexOfStrAwayGoalDetails = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayGoalDetails");
          final int _cursorIndexOfStrAwayLineupDefense = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupDefense");
          final int _cursorIndexOfStrAwayLineupForward = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupForward");
          final int _cursorIndexOfStrAwayLineupGoalkeeper = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupGoalkeeper");
          final int _cursorIndexOfStrAwayLineupMidfield = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupMidfield");
          final int _cursorIndexOfStrAwayLineupSubstitutes = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupSubstitutes");
          final int _cursorIndexOfStrAwayRedCards = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayRedCards");
          final int _cursorIndexOfStrAwayTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayTeam");
          final int _cursorIndexOfStrAwayYellowCards = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayYellowCards");
          final int _cursorIndexOfStrBanner = CursorUtil.getColumnIndexOrThrow(_cursor, "strBanner");
          final int _cursorIndexOfStrCircuit = CursorUtil.getColumnIndexOrThrow(_cursor, "strCircuit");
          final int _cursorIndexOfStrCity = CursorUtil.getColumnIndexOrThrow(_cursor, "strCity");
          final int _cursorIndexOfStrCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "strCountry");
          final int _cursorIndexOfStrDate = CursorUtil.getColumnIndexOrThrow(_cursor, "strDate");
          final int _cursorIndexOfStrDescriptionEN = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionEN");
          final int _cursorIndexOfStrEvent = CursorUtil.getColumnIndexOrThrow(_cursor, "strEvent");
          final int _cursorIndexOfStrFanart = CursorUtil.getColumnIndexOrThrow(_cursor, "strFanart");
          final int _cursorIndexOfStrFilename = CursorUtil.getColumnIndexOrThrow(_cursor, "strFilename");
          final int _cursorIndexOfStrHomeFormation = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeFormation");
          final int _cursorIndexOfStrHomeGoalDetails = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeGoalDetails");
          final int _cursorIndexOfStrHomeLineupDefense = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupDefense");
          final int _cursorIndexOfStrHomeLineupForward = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupForward");
          final int _cursorIndexOfStrHomeLineupGoalkeeper = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupGoalkeeper");
          final int _cursorIndexOfStrHomeLineupMidfield = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupMidfield");
          final int _cursorIndexOfStrHomeLineupSubstitutes = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupSubstitutes");
          final int _cursorIndexOfStrHomeRedCards = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeRedCards");
          final int _cursorIndexOfStrHomeTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeTeam");
          final int _cursorIndexOfStrHomeYellowCards = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeYellowCards");
          final int _cursorIndexOfStrLeague = CursorUtil.getColumnIndexOrThrow(_cursor, "strLeague");
          final int _cursorIndexOfStrLocked = CursorUtil.getColumnIndexOrThrow(_cursor, "strLocked");
          final int _cursorIndexOfStrMap = CursorUtil.getColumnIndexOrThrow(_cursor, "strMap");
          final int _cursorIndexOfStrPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "strPoster");
          final int _cursorIndexOfStrResult = CursorUtil.getColumnIndexOrThrow(_cursor, "strResult");
          final int _cursorIndexOfStrSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "strSeason");
          final int _cursorIndexOfStrSport = CursorUtil.getColumnIndexOrThrow(_cursor, "strSport");
          final int _cursorIndexOfStrTVStation = CursorUtil.getColumnIndexOrThrow(_cursor, "strTVStation");
          final int _cursorIndexOfStrThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "strThumb");
          final int _cursorIndexOfStrTime = CursorUtil.getColumnIndexOrThrow(_cursor, "strTime");
          final List<Match> _result = new ArrayList<Match>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Match _item;
            final String _tmpIdEvent;
            _tmpIdEvent = _cursor.getString(_cursorIndexOfIdEvent);
            final String _tmpDateEvent;
            _tmpDateEvent = _cursor.getString(_cursorIndexOfDateEvent);
            final String _tmpIdAwayTeam;
            _tmpIdAwayTeam = _cursor.getString(_cursorIndexOfIdAwayTeam);
            final String _tmpIdHomeTeam;
            _tmpIdHomeTeam = _cursor.getString(_cursorIndexOfIdHomeTeam);
            final String _tmpIdLeague;
            _tmpIdLeague = _cursor.getString(_cursorIndexOfIdLeague);
            final String _tmpIdSoccerXML;
            _tmpIdSoccerXML = _cursor.getString(_cursorIndexOfIdSoccerXML);
            final String _tmpIntAwayScore;
            _tmpIntAwayScore = _cursor.getString(_cursorIndexOfIntAwayScore);
            final String _tmpIntAwayShots;
            _tmpIntAwayShots = _cursor.getString(_cursorIndexOfIntAwayShots);
            final String _tmpIntHomeScore;
            _tmpIntHomeScore = _cursor.getString(_cursorIndexOfIntHomeScore);
            final String _tmpIntHomeShots;
            _tmpIntHomeShots = _cursor.getString(_cursorIndexOfIntHomeShots);
            final String _tmpIntRound;
            _tmpIntRound = _cursor.getString(_cursorIndexOfIntRound);
            final String _tmpIntSpectators;
            _tmpIntSpectators = _cursor.getString(_cursorIndexOfIntSpectators);
            final String _tmpStrAwayFormation;
            _tmpStrAwayFormation = _cursor.getString(_cursorIndexOfStrAwayFormation);
            final String _tmpStrAwayGoalDetails;
            _tmpStrAwayGoalDetails = _cursor.getString(_cursorIndexOfStrAwayGoalDetails);
            final String _tmpStrAwayLineupDefense;
            _tmpStrAwayLineupDefense = _cursor.getString(_cursorIndexOfStrAwayLineupDefense);
            final String _tmpStrAwayLineupForward;
            _tmpStrAwayLineupForward = _cursor.getString(_cursorIndexOfStrAwayLineupForward);
            final String _tmpStrAwayLineupGoalkeeper;
            _tmpStrAwayLineupGoalkeeper = _cursor.getString(_cursorIndexOfStrAwayLineupGoalkeeper);
            final String _tmpStrAwayLineupMidfield;
            _tmpStrAwayLineupMidfield = _cursor.getString(_cursorIndexOfStrAwayLineupMidfield);
            final String _tmpStrAwayLineupSubstitutes;
            _tmpStrAwayLineupSubstitutes = _cursor.getString(_cursorIndexOfStrAwayLineupSubstitutes);
            final String _tmpStrAwayRedCards;
            _tmpStrAwayRedCards = _cursor.getString(_cursorIndexOfStrAwayRedCards);
            final String _tmpStrAwayTeam;
            _tmpStrAwayTeam = _cursor.getString(_cursorIndexOfStrAwayTeam);
            final String _tmpStrAwayYellowCards;
            _tmpStrAwayYellowCards = _cursor.getString(_cursorIndexOfStrAwayYellowCards);
            final String _tmpStrBanner;
            _tmpStrBanner = _cursor.getString(_cursorIndexOfStrBanner);
            final String _tmpStrCircuit;
            _tmpStrCircuit = _cursor.getString(_cursorIndexOfStrCircuit);
            final String _tmpStrCity;
            _tmpStrCity = _cursor.getString(_cursorIndexOfStrCity);
            final String _tmpStrCountry;
            _tmpStrCountry = _cursor.getString(_cursorIndexOfStrCountry);
            final String _tmpStrDate;
            _tmpStrDate = _cursor.getString(_cursorIndexOfStrDate);
            final String _tmpStrDescriptionEN;
            _tmpStrDescriptionEN = _cursor.getString(_cursorIndexOfStrDescriptionEN);
            final String _tmpStrEvent;
            _tmpStrEvent = _cursor.getString(_cursorIndexOfStrEvent);
            final String _tmpStrFanart;
            _tmpStrFanart = _cursor.getString(_cursorIndexOfStrFanart);
            final String _tmpStrFilename;
            _tmpStrFilename = _cursor.getString(_cursorIndexOfStrFilename);
            final String _tmpStrHomeFormation;
            _tmpStrHomeFormation = _cursor.getString(_cursorIndexOfStrHomeFormation);
            final String _tmpStrHomeGoalDetails;
            _tmpStrHomeGoalDetails = _cursor.getString(_cursorIndexOfStrHomeGoalDetails);
            final String _tmpStrHomeLineupDefense;
            _tmpStrHomeLineupDefense = _cursor.getString(_cursorIndexOfStrHomeLineupDefense);
            final String _tmpStrHomeLineupForward;
            _tmpStrHomeLineupForward = _cursor.getString(_cursorIndexOfStrHomeLineupForward);
            final String _tmpStrHomeLineupGoalkeeper;
            _tmpStrHomeLineupGoalkeeper = _cursor.getString(_cursorIndexOfStrHomeLineupGoalkeeper);
            final String _tmpStrHomeLineupMidfield;
            _tmpStrHomeLineupMidfield = _cursor.getString(_cursorIndexOfStrHomeLineupMidfield);
            final String _tmpStrHomeLineupSubstitutes;
            _tmpStrHomeLineupSubstitutes = _cursor.getString(_cursorIndexOfStrHomeLineupSubstitutes);
            final String _tmpStrHomeRedCards;
            _tmpStrHomeRedCards = _cursor.getString(_cursorIndexOfStrHomeRedCards);
            final String _tmpStrHomeTeam;
            _tmpStrHomeTeam = _cursor.getString(_cursorIndexOfStrHomeTeam);
            final String _tmpStrHomeYellowCards;
            _tmpStrHomeYellowCards = _cursor.getString(_cursorIndexOfStrHomeYellowCards);
            final String _tmpStrLeague;
            _tmpStrLeague = _cursor.getString(_cursorIndexOfStrLeague);
            final String _tmpStrLocked;
            _tmpStrLocked = _cursor.getString(_cursorIndexOfStrLocked);
            final String _tmpStrMap;
            _tmpStrMap = _cursor.getString(_cursorIndexOfStrMap);
            final String _tmpStrPoster;
            _tmpStrPoster = _cursor.getString(_cursorIndexOfStrPoster);
            final String _tmpStrResult;
            _tmpStrResult = _cursor.getString(_cursorIndexOfStrResult);
            final String _tmpStrSeason;
            _tmpStrSeason = _cursor.getString(_cursorIndexOfStrSeason);
            final String _tmpStrSport;
            _tmpStrSport = _cursor.getString(_cursorIndexOfStrSport);
            final String _tmpStrTVStation;
            _tmpStrTVStation = _cursor.getString(_cursorIndexOfStrTVStation);
            final String _tmpStrThumb;
            _tmpStrThumb = _cursor.getString(_cursorIndexOfStrThumb);
            final String _tmpStrTime;
            _tmpStrTime = _cursor.getString(_cursorIndexOfStrTime);
            _item = new Match(_tmpIdEvent,_tmpDateEvent,_tmpIdAwayTeam,_tmpIdHomeTeam,_tmpIdLeague,_tmpIdSoccerXML,_tmpIntAwayScore,_tmpIntAwayShots,_tmpIntHomeScore,_tmpIntHomeShots,_tmpIntRound,_tmpIntSpectators,_tmpStrAwayFormation,_tmpStrAwayGoalDetails,_tmpStrAwayLineupDefense,_tmpStrAwayLineupForward,_tmpStrAwayLineupGoalkeeper,_tmpStrAwayLineupMidfield,_tmpStrAwayLineupSubstitutes,_tmpStrAwayRedCards,_tmpStrAwayTeam,_tmpStrAwayYellowCards,_tmpStrBanner,_tmpStrCircuit,_tmpStrCity,_tmpStrCountry,_tmpStrDate,_tmpStrDescriptionEN,_tmpStrEvent,_tmpStrFanart,_tmpStrFilename,_tmpStrHomeFormation,_tmpStrHomeGoalDetails,_tmpStrHomeLineupDefense,_tmpStrHomeLineupForward,_tmpStrHomeLineupGoalkeeper,_tmpStrHomeLineupMidfield,_tmpStrHomeLineupSubstitutes,_tmpStrHomeRedCards,_tmpStrHomeTeam,_tmpStrHomeYellowCards,_tmpStrLeague,_tmpStrLocked,_tmpStrMap,_tmpStrPoster,_tmpStrResult,_tmpStrSeason,_tmpStrSport,_tmpStrTVStation,_tmpStrThumb,_tmpStrTime);
            final String _tmpMatchType;
            _tmpMatchType = _cursor.getString(_cursorIndexOfMatchType);
            _item.setMatchType(_tmpMatchType);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Team>> getTeams(final String leagueId) {
    final String _sql = "SELECT * FROM teams WHERE idLeague = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (leagueId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, leagueId);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"teams"}, new Callable<List<Team>>() {
      @Override
      public List<Team> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfIdLeague = CursorUtil.getColumnIndexOrThrow(_cursor, "idLeague");
          final int _cursorIndexOfIdTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "idTeam");
          final int _cursorIndexOfIdSoccerXML = CursorUtil.getColumnIndexOrThrow(_cursor, "idSoccerXML");
          final int _cursorIndexOfIntFormedYear = CursorUtil.getColumnIndexOrThrow(_cursor, "intFormedYear");
          final int _cursorIndexOfIntLoved = CursorUtil.getColumnIndexOrThrow(_cursor, "intLoved");
          final int _cursorIndexOfIntStadiumCapacity = CursorUtil.getColumnIndexOrThrow(_cursor, "intStadiumCapacity");
          final int _cursorIndexOfStrAlternate = CursorUtil.getColumnIndexOrThrow(_cursor, "strAlternate");
          final int _cursorIndexOfStrCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "strCountry");
          final int _cursorIndexOfStrDescriptionCN = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionCN");
          final int _cursorIndexOfStrDescriptionDE = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionDE");
          final int _cursorIndexOfStrDescriptionEN = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionEN");
          final int _cursorIndexOfStrDescriptionES = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionES");
          final int _cursorIndexOfStrDescriptionFR = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionFR");
          final int _cursorIndexOfStrDescriptionHU = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionHU");
          final int _cursorIndexOfStrDescriptionIL = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionIL");
          final int _cursorIndexOfStrDescriptionIT = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionIT");
          final int _cursorIndexOfStrDescriptionJP = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionJP");
          final int _cursorIndexOfStrDescriptionNL = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionNL");
          final int _cursorIndexOfStrDescriptionNO = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionNO");
          final int _cursorIndexOfStrDescriptionPL = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionPL");
          final int _cursorIndexOfStrDescriptionPT = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionPT");
          final int _cursorIndexOfStrDescriptionRU = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionRU");
          final int _cursorIndexOfStrDescriptionSE = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionSE");
          final int _cursorIndexOfStrDivision = CursorUtil.getColumnIndexOrThrow(_cursor, "strDivision");
          final int _cursorIndexOfStrFacebook = CursorUtil.getColumnIndexOrThrow(_cursor, "strFacebook");
          final int _cursorIndexOfStrGender = CursorUtil.getColumnIndexOrThrow(_cursor, "strGender");
          final int _cursorIndexOfStrInstagram = CursorUtil.getColumnIndexOrThrow(_cursor, "strInstagram");
          final int _cursorIndexOfStrKeywords = CursorUtil.getColumnIndexOrThrow(_cursor, "strKeywords");
          final int _cursorIndexOfStrLeague = CursorUtil.getColumnIndexOrThrow(_cursor, "strLeague");
          final int _cursorIndexOfStrLocked = CursorUtil.getColumnIndexOrThrow(_cursor, "strLocked");
          final int _cursorIndexOfStrManager = CursorUtil.getColumnIndexOrThrow(_cursor, "strManager");
          final int _cursorIndexOfStrRSS = CursorUtil.getColumnIndexOrThrow(_cursor, "strRSS");
          final int _cursorIndexOfStrSport = CursorUtil.getColumnIndexOrThrow(_cursor, "strSport");
          final int _cursorIndexOfStrStadium = CursorUtil.getColumnIndexOrThrow(_cursor, "strStadium");
          final int _cursorIndexOfStrStadiumDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "strStadiumDescription");
          final int _cursorIndexOfStrStadiumLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "strStadiumLocation");
          final int _cursorIndexOfStrStadiumThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "strStadiumThumb");
          final int _cursorIndexOfStrTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeam");
          final int _cursorIndexOfStrTeamBadge = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamBadge");
          final int _cursorIndexOfStrTeamBanner = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamBanner");
          final int _cursorIndexOfStrTeamFanart1 = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamFanart1");
          final int _cursorIndexOfStrTeamFanart2 = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamFanart2");
          final int _cursorIndexOfStrTeamFanart3 = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamFanart3");
          final int _cursorIndexOfStrTeamFanart4 = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamFanart4");
          final int _cursorIndexOfStrTeamJersey = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamJersey");
          final int _cursorIndexOfStrTeamLogo = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamLogo");
          final int _cursorIndexOfStrTeamShort = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamShort");
          final int _cursorIndexOfStrTwitter = CursorUtil.getColumnIndexOrThrow(_cursor, "strTwitter");
          final int _cursorIndexOfStrWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "strWebsite");
          final int _cursorIndexOfStrYoutube = CursorUtil.getColumnIndexOrThrow(_cursor, "strYoutube");
          final List<Team> _result = new ArrayList<Team>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Team _item;
            final String _tmpIdLeague;
            _tmpIdLeague = _cursor.getString(_cursorIndexOfIdLeague);
            final String _tmpIdTeam;
            _tmpIdTeam = _cursor.getString(_cursorIndexOfIdTeam);
            final String _tmpIdSoccerXML;
            _tmpIdSoccerXML = _cursor.getString(_cursorIndexOfIdSoccerXML);
            final String _tmpIntFormedYear;
            _tmpIntFormedYear = _cursor.getString(_cursorIndexOfIntFormedYear);
            final String _tmpIntLoved;
            _tmpIntLoved = _cursor.getString(_cursorIndexOfIntLoved);
            final String _tmpIntStadiumCapacity;
            _tmpIntStadiumCapacity = _cursor.getString(_cursorIndexOfIntStadiumCapacity);
            final String _tmpStrAlternate;
            _tmpStrAlternate = _cursor.getString(_cursorIndexOfStrAlternate);
            final String _tmpStrCountry;
            _tmpStrCountry = _cursor.getString(_cursorIndexOfStrCountry);
            final String _tmpStrDescriptionCN;
            _tmpStrDescriptionCN = _cursor.getString(_cursorIndexOfStrDescriptionCN);
            final String _tmpStrDescriptionDE;
            _tmpStrDescriptionDE = _cursor.getString(_cursorIndexOfStrDescriptionDE);
            final String _tmpStrDescriptionEN;
            _tmpStrDescriptionEN = _cursor.getString(_cursorIndexOfStrDescriptionEN);
            final String _tmpStrDescriptionES;
            _tmpStrDescriptionES = _cursor.getString(_cursorIndexOfStrDescriptionES);
            final String _tmpStrDescriptionFR;
            _tmpStrDescriptionFR = _cursor.getString(_cursorIndexOfStrDescriptionFR);
            final String _tmpStrDescriptionHU;
            _tmpStrDescriptionHU = _cursor.getString(_cursorIndexOfStrDescriptionHU);
            final String _tmpStrDescriptionIL;
            _tmpStrDescriptionIL = _cursor.getString(_cursorIndexOfStrDescriptionIL);
            final String _tmpStrDescriptionIT;
            _tmpStrDescriptionIT = _cursor.getString(_cursorIndexOfStrDescriptionIT);
            final String _tmpStrDescriptionJP;
            _tmpStrDescriptionJP = _cursor.getString(_cursorIndexOfStrDescriptionJP);
            final String _tmpStrDescriptionNL;
            _tmpStrDescriptionNL = _cursor.getString(_cursorIndexOfStrDescriptionNL);
            final String _tmpStrDescriptionNO;
            _tmpStrDescriptionNO = _cursor.getString(_cursorIndexOfStrDescriptionNO);
            final String _tmpStrDescriptionPL;
            _tmpStrDescriptionPL = _cursor.getString(_cursorIndexOfStrDescriptionPL);
            final String _tmpStrDescriptionPT;
            _tmpStrDescriptionPT = _cursor.getString(_cursorIndexOfStrDescriptionPT);
            final String _tmpStrDescriptionRU;
            _tmpStrDescriptionRU = _cursor.getString(_cursorIndexOfStrDescriptionRU);
            final String _tmpStrDescriptionSE;
            _tmpStrDescriptionSE = _cursor.getString(_cursorIndexOfStrDescriptionSE);
            final String _tmpStrDivision;
            _tmpStrDivision = _cursor.getString(_cursorIndexOfStrDivision);
            final String _tmpStrFacebook;
            _tmpStrFacebook = _cursor.getString(_cursorIndexOfStrFacebook);
            final String _tmpStrGender;
            _tmpStrGender = _cursor.getString(_cursorIndexOfStrGender);
            final String _tmpStrInstagram;
            _tmpStrInstagram = _cursor.getString(_cursorIndexOfStrInstagram);
            final String _tmpStrKeywords;
            _tmpStrKeywords = _cursor.getString(_cursorIndexOfStrKeywords);
            final String _tmpStrLeague;
            _tmpStrLeague = _cursor.getString(_cursorIndexOfStrLeague);
            final String _tmpStrLocked;
            _tmpStrLocked = _cursor.getString(_cursorIndexOfStrLocked);
            final String _tmpStrManager;
            _tmpStrManager = _cursor.getString(_cursorIndexOfStrManager);
            final String _tmpStrRSS;
            _tmpStrRSS = _cursor.getString(_cursorIndexOfStrRSS);
            final String _tmpStrSport;
            _tmpStrSport = _cursor.getString(_cursorIndexOfStrSport);
            final String _tmpStrStadium;
            _tmpStrStadium = _cursor.getString(_cursorIndexOfStrStadium);
            final String _tmpStrStadiumDescription;
            _tmpStrStadiumDescription = _cursor.getString(_cursorIndexOfStrStadiumDescription);
            final String _tmpStrStadiumLocation;
            _tmpStrStadiumLocation = _cursor.getString(_cursorIndexOfStrStadiumLocation);
            final String _tmpStrStadiumThumb;
            _tmpStrStadiumThumb = _cursor.getString(_cursorIndexOfStrStadiumThumb);
            final String _tmpStrTeam;
            _tmpStrTeam = _cursor.getString(_cursorIndexOfStrTeam);
            final String _tmpStrTeamBadge;
            _tmpStrTeamBadge = _cursor.getString(_cursorIndexOfStrTeamBadge);
            final String _tmpStrTeamBanner;
            _tmpStrTeamBanner = _cursor.getString(_cursorIndexOfStrTeamBanner);
            final String _tmpStrTeamFanart1;
            _tmpStrTeamFanart1 = _cursor.getString(_cursorIndexOfStrTeamFanart1);
            final String _tmpStrTeamFanart2;
            _tmpStrTeamFanart2 = _cursor.getString(_cursorIndexOfStrTeamFanart2);
            final String _tmpStrTeamFanart3;
            _tmpStrTeamFanart3 = _cursor.getString(_cursorIndexOfStrTeamFanart3);
            final String _tmpStrTeamFanart4;
            _tmpStrTeamFanart4 = _cursor.getString(_cursorIndexOfStrTeamFanart4);
            final String _tmpStrTeamJersey;
            _tmpStrTeamJersey = _cursor.getString(_cursorIndexOfStrTeamJersey);
            final String _tmpStrTeamLogo;
            _tmpStrTeamLogo = _cursor.getString(_cursorIndexOfStrTeamLogo);
            final String _tmpStrTeamShort;
            _tmpStrTeamShort = _cursor.getString(_cursorIndexOfStrTeamShort);
            final String _tmpStrTwitter;
            _tmpStrTwitter = _cursor.getString(_cursorIndexOfStrTwitter);
            final String _tmpStrWebsite;
            _tmpStrWebsite = _cursor.getString(_cursorIndexOfStrWebsite);
            final String _tmpStrYoutube;
            _tmpStrYoutube = _cursor.getString(_cursorIndexOfStrYoutube);
            _item = new Team(_tmpIdLeague,_tmpIdTeam,_tmpIdSoccerXML,_tmpIntFormedYear,_tmpIntLoved,_tmpIntStadiumCapacity,_tmpStrAlternate,_tmpStrCountry,_tmpStrDescriptionCN,_tmpStrDescriptionDE,_tmpStrDescriptionEN,_tmpStrDescriptionES,_tmpStrDescriptionFR,_tmpStrDescriptionHU,_tmpStrDescriptionIL,_tmpStrDescriptionIT,_tmpStrDescriptionJP,_tmpStrDescriptionNL,_tmpStrDescriptionNO,_tmpStrDescriptionPL,_tmpStrDescriptionPT,_tmpStrDescriptionRU,_tmpStrDescriptionSE,_tmpStrDivision,_tmpStrFacebook,_tmpStrGender,_tmpStrInstagram,_tmpStrKeywords,_tmpStrLeague,_tmpStrLocked,_tmpStrManager,_tmpStrRSS,_tmpStrSport,_tmpStrStadium,_tmpStrStadiumDescription,_tmpStrStadiumLocation,_tmpStrStadiumThumb,_tmpStrTeam,_tmpStrTeamBadge,_tmpStrTeamBanner,_tmpStrTeamFanart1,_tmpStrTeamFanart2,_tmpStrTeamFanart3,_tmpStrTeamFanart4,_tmpStrTeamJersey,_tmpStrTeamLogo,_tmpStrTeamShort,_tmpStrTwitter,_tmpStrWebsite,_tmpStrYoutube);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Team> getTeam(final String teamId) {
    final String _sql = "SELECT * FROM teams WHERE idTeam = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (teamId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, teamId);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"teams"}, new Callable<Team>() {
      @Override
      public Team call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfIdLeague = CursorUtil.getColumnIndexOrThrow(_cursor, "idLeague");
          final int _cursorIndexOfIdTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "idTeam");
          final int _cursorIndexOfIdSoccerXML = CursorUtil.getColumnIndexOrThrow(_cursor, "idSoccerXML");
          final int _cursorIndexOfIntFormedYear = CursorUtil.getColumnIndexOrThrow(_cursor, "intFormedYear");
          final int _cursorIndexOfIntLoved = CursorUtil.getColumnIndexOrThrow(_cursor, "intLoved");
          final int _cursorIndexOfIntStadiumCapacity = CursorUtil.getColumnIndexOrThrow(_cursor, "intStadiumCapacity");
          final int _cursorIndexOfStrAlternate = CursorUtil.getColumnIndexOrThrow(_cursor, "strAlternate");
          final int _cursorIndexOfStrCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "strCountry");
          final int _cursorIndexOfStrDescriptionCN = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionCN");
          final int _cursorIndexOfStrDescriptionDE = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionDE");
          final int _cursorIndexOfStrDescriptionEN = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionEN");
          final int _cursorIndexOfStrDescriptionES = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionES");
          final int _cursorIndexOfStrDescriptionFR = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionFR");
          final int _cursorIndexOfStrDescriptionHU = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionHU");
          final int _cursorIndexOfStrDescriptionIL = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionIL");
          final int _cursorIndexOfStrDescriptionIT = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionIT");
          final int _cursorIndexOfStrDescriptionJP = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionJP");
          final int _cursorIndexOfStrDescriptionNL = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionNL");
          final int _cursorIndexOfStrDescriptionNO = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionNO");
          final int _cursorIndexOfStrDescriptionPL = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionPL");
          final int _cursorIndexOfStrDescriptionPT = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionPT");
          final int _cursorIndexOfStrDescriptionRU = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionRU");
          final int _cursorIndexOfStrDescriptionSE = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionSE");
          final int _cursorIndexOfStrDivision = CursorUtil.getColumnIndexOrThrow(_cursor, "strDivision");
          final int _cursorIndexOfStrFacebook = CursorUtil.getColumnIndexOrThrow(_cursor, "strFacebook");
          final int _cursorIndexOfStrGender = CursorUtil.getColumnIndexOrThrow(_cursor, "strGender");
          final int _cursorIndexOfStrInstagram = CursorUtil.getColumnIndexOrThrow(_cursor, "strInstagram");
          final int _cursorIndexOfStrKeywords = CursorUtil.getColumnIndexOrThrow(_cursor, "strKeywords");
          final int _cursorIndexOfStrLeague = CursorUtil.getColumnIndexOrThrow(_cursor, "strLeague");
          final int _cursorIndexOfStrLocked = CursorUtil.getColumnIndexOrThrow(_cursor, "strLocked");
          final int _cursorIndexOfStrManager = CursorUtil.getColumnIndexOrThrow(_cursor, "strManager");
          final int _cursorIndexOfStrRSS = CursorUtil.getColumnIndexOrThrow(_cursor, "strRSS");
          final int _cursorIndexOfStrSport = CursorUtil.getColumnIndexOrThrow(_cursor, "strSport");
          final int _cursorIndexOfStrStadium = CursorUtil.getColumnIndexOrThrow(_cursor, "strStadium");
          final int _cursorIndexOfStrStadiumDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "strStadiumDescription");
          final int _cursorIndexOfStrStadiumLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "strStadiumLocation");
          final int _cursorIndexOfStrStadiumThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "strStadiumThumb");
          final int _cursorIndexOfStrTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeam");
          final int _cursorIndexOfStrTeamBadge = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamBadge");
          final int _cursorIndexOfStrTeamBanner = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamBanner");
          final int _cursorIndexOfStrTeamFanart1 = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamFanart1");
          final int _cursorIndexOfStrTeamFanart2 = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamFanart2");
          final int _cursorIndexOfStrTeamFanart3 = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamFanart3");
          final int _cursorIndexOfStrTeamFanart4 = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamFanart4");
          final int _cursorIndexOfStrTeamJersey = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamJersey");
          final int _cursorIndexOfStrTeamLogo = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamLogo");
          final int _cursorIndexOfStrTeamShort = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamShort");
          final int _cursorIndexOfStrTwitter = CursorUtil.getColumnIndexOrThrow(_cursor, "strTwitter");
          final int _cursorIndexOfStrWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "strWebsite");
          final int _cursorIndexOfStrYoutube = CursorUtil.getColumnIndexOrThrow(_cursor, "strYoutube");
          final Team _result;
          if(_cursor.moveToFirst()) {
            final String _tmpIdLeague;
            _tmpIdLeague = _cursor.getString(_cursorIndexOfIdLeague);
            final String _tmpIdTeam;
            _tmpIdTeam = _cursor.getString(_cursorIndexOfIdTeam);
            final String _tmpIdSoccerXML;
            _tmpIdSoccerXML = _cursor.getString(_cursorIndexOfIdSoccerXML);
            final String _tmpIntFormedYear;
            _tmpIntFormedYear = _cursor.getString(_cursorIndexOfIntFormedYear);
            final String _tmpIntLoved;
            _tmpIntLoved = _cursor.getString(_cursorIndexOfIntLoved);
            final String _tmpIntStadiumCapacity;
            _tmpIntStadiumCapacity = _cursor.getString(_cursorIndexOfIntStadiumCapacity);
            final String _tmpStrAlternate;
            _tmpStrAlternate = _cursor.getString(_cursorIndexOfStrAlternate);
            final String _tmpStrCountry;
            _tmpStrCountry = _cursor.getString(_cursorIndexOfStrCountry);
            final String _tmpStrDescriptionCN;
            _tmpStrDescriptionCN = _cursor.getString(_cursorIndexOfStrDescriptionCN);
            final String _tmpStrDescriptionDE;
            _tmpStrDescriptionDE = _cursor.getString(_cursorIndexOfStrDescriptionDE);
            final String _tmpStrDescriptionEN;
            _tmpStrDescriptionEN = _cursor.getString(_cursorIndexOfStrDescriptionEN);
            final String _tmpStrDescriptionES;
            _tmpStrDescriptionES = _cursor.getString(_cursorIndexOfStrDescriptionES);
            final String _tmpStrDescriptionFR;
            _tmpStrDescriptionFR = _cursor.getString(_cursorIndexOfStrDescriptionFR);
            final String _tmpStrDescriptionHU;
            _tmpStrDescriptionHU = _cursor.getString(_cursorIndexOfStrDescriptionHU);
            final String _tmpStrDescriptionIL;
            _tmpStrDescriptionIL = _cursor.getString(_cursorIndexOfStrDescriptionIL);
            final String _tmpStrDescriptionIT;
            _tmpStrDescriptionIT = _cursor.getString(_cursorIndexOfStrDescriptionIT);
            final String _tmpStrDescriptionJP;
            _tmpStrDescriptionJP = _cursor.getString(_cursorIndexOfStrDescriptionJP);
            final String _tmpStrDescriptionNL;
            _tmpStrDescriptionNL = _cursor.getString(_cursorIndexOfStrDescriptionNL);
            final String _tmpStrDescriptionNO;
            _tmpStrDescriptionNO = _cursor.getString(_cursorIndexOfStrDescriptionNO);
            final String _tmpStrDescriptionPL;
            _tmpStrDescriptionPL = _cursor.getString(_cursorIndexOfStrDescriptionPL);
            final String _tmpStrDescriptionPT;
            _tmpStrDescriptionPT = _cursor.getString(_cursorIndexOfStrDescriptionPT);
            final String _tmpStrDescriptionRU;
            _tmpStrDescriptionRU = _cursor.getString(_cursorIndexOfStrDescriptionRU);
            final String _tmpStrDescriptionSE;
            _tmpStrDescriptionSE = _cursor.getString(_cursorIndexOfStrDescriptionSE);
            final String _tmpStrDivision;
            _tmpStrDivision = _cursor.getString(_cursorIndexOfStrDivision);
            final String _tmpStrFacebook;
            _tmpStrFacebook = _cursor.getString(_cursorIndexOfStrFacebook);
            final String _tmpStrGender;
            _tmpStrGender = _cursor.getString(_cursorIndexOfStrGender);
            final String _tmpStrInstagram;
            _tmpStrInstagram = _cursor.getString(_cursorIndexOfStrInstagram);
            final String _tmpStrKeywords;
            _tmpStrKeywords = _cursor.getString(_cursorIndexOfStrKeywords);
            final String _tmpStrLeague;
            _tmpStrLeague = _cursor.getString(_cursorIndexOfStrLeague);
            final String _tmpStrLocked;
            _tmpStrLocked = _cursor.getString(_cursorIndexOfStrLocked);
            final String _tmpStrManager;
            _tmpStrManager = _cursor.getString(_cursorIndexOfStrManager);
            final String _tmpStrRSS;
            _tmpStrRSS = _cursor.getString(_cursorIndexOfStrRSS);
            final String _tmpStrSport;
            _tmpStrSport = _cursor.getString(_cursorIndexOfStrSport);
            final String _tmpStrStadium;
            _tmpStrStadium = _cursor.getString(_cursorIndexOfStrStadium);
            final String _tmpStrStadiumDescription;
            _tmpStrStadiumDescription = _cursor.getString(_cursorIndexOfStrStadiumDescription);
            final String _tmpStrStadiumLocation;
            _tmpStrStadiumLocation = _cursor.getString(_cursorIndexOfStrStadiumLocation);
            final String _tmpStrStadiumThumb;
            _tmpStrStadiumThumb = _cursor.getString(_cursorIndexOfStrStadiumThumb);
            final String _tmpStrTeam;
            _tmpStrTeam = _cursor.getString(_cursorIndexOfStrTeam);
            final String _tmpStrTeamBadge;
            _tmpStrTeamBadge = _cursor.getString(_cursorIndexOfStrTeamBadge);
            final String _tmpStrTeamBanner;
            _tmpStrTeamBanner = _cursor.getString(_cursorIndexOfStrTeamBanner);
            final String _tmpStrTeamFanart1;
            _tmpStrTeamFanart1 = _cursor.getString(_cursorIndexOfStrTeamFanart1);
            final String _tmpStrTeamFanart2;
            _tmpStrTeamFanart2 = _cursor.getString(_cursorIndexOfStrTeamFanart2);
            final String _tmpStrTeamFanart3;
            _tmpStrTeamFanart3 = _cursor.getString(_cursorIndexOfStrTeamFanart3);
            final String _tmpStrTeamFanart4;
            _tmpStrTeamFanart4 = _cursor.getString(_cursorIndexOfStrTeamFanart4);
            final String _tmpStrTeamJersey;
            _tmpStrTeamJersey = _cursor.getString(_cursorIndexOfStrTeamJersey);
            final String _tmpStrTeamLogo;
            _tmpStrTeamLogo = _cursor.getString(_cursorIndexOfStrTeamLogo);
            final String _tmpStrTeamShort;
            _tmpStrTeamShort = _cursor.getString(_cursorIndexOfStrTeamShort);
            final String _tmpStrTwitter;
            _tmpStrTwitter = _cursor.getString(_cursorIndexOfStrTwitter);
            final String _tmpStrWebsite;
            _tmpStrWebsite = _cursor.getString(_cursorIndexOfStrWebsite);
            final String _tmpStrYoutube;
            _tmpStrYoutube = _cursor.getString(_cursorIndexOfStrYoutube);
            _result = new Team(_tmpIdLeague,_tmpIdTeam,_tmpIdSoccerXML,_tmpIntFormedYear,_tmpIntLoved,_tmpIntStadiumCapacity,_tmpStrAlternate,_tmpStrCountry,_tmpStrDescriptionCN,_tmpStrDescriptionDE,_tmpStrDescriptionEN,_tmpStrDescriptionES,_tmpStrDescriptionFR,_tmpStrDescriptionHU,_tmpStrDescriptionIL,_tmpStrDescriptionIT,_tmpStrDescriptionJP,_tmpStrDescriptionNL,_tmpStrDescriptionNO,_tmpStrDescriptionPL,_tmpStrDescriptionPT,_tmpStrDescriptionRU,_tmpStrDescriptionSE,_tmpStrDivision,_tmpStrFacebook,_tmpStrGender,_tmpStrInstagram,_tmpStrKeywords,_tmpStrLeague,_tmpStrLocked,_tmpStrManager,_tmpStrRSS,_tmpStrSport,_tmpStrStadium,_tmpStrStadiumDescription,_tmpStrStadiumLocation,_tmpStrStadiumThumb,_tmpStrTeam,_tmpStrTeamBadge,_tmpStrTeamBanner,_tmpStrTeamFanart1,_tmpStrTeamFanart2,_tmpStrTeamFanart3,_tmpStrTeamFanart4,_tmpStrTeamJersey,_tmpStrTeamLogo,_tmpStrTeamShort,_tmpStrTwitter,_tmpStrWebsite,_tmpStrYoutube);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Match> getMatchDetail(final String matchId) {
    final String _sql = "SELECT * FROM matches WHERE idEvent = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (matchId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, matchId);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"matches"}, new Callable<Match>() {
      @Override
      public Match call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfMatchType = CursorUtil.getColumnIndexOrThrow(_cursor, "matchType");
          final int _cursorIndexOfIdEvent = CursorUtil.getColumnIndexOrThrow(_cursor, "idEvent");
          final int _cursorIndexOfDateEvent = CursorUtil.getColumnIndexOrThrow(_cursor, "dateEvent");
          final int _cursorIndexOfIdAwayTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "idAwayTeam");
          final int _cursorIndexOfIdHomeTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "idHomeTeam");
          final int _cursorIndexOfIdLeague = CursorUtil.getColumnIndexOrThrow(_cursor, "idLeague");
          final int _cursorIndexOfIdSoccerXML = CursorUtil.getColumnIndexOrThrow(_cursor, "idSoccerXML");
          final int _cursorIndexOfIntAwayScore = CursorUtil.getColumnIndexOrThrow(_cursor, "intAwayScore");
          final int _cursorIndexOfIntAwayShots = CursorUtil.getColumnIndexOrThrow(_cursor, "intAwayShots");
          final int _cursorIndexOfIntHomeScore = CursorUtil.getColumnIndexOrThrow(_cursor, "intHomeScore");
          final int _cursorIndexOfIntHomeShots = CursorUtil.getColumnIndexOrThrow(_cursor, "intHomeShots");
          final int _cursorIndexOfIntRound = CursorUtil.getColumnIndexOrThrow(_cursor, "intRound");
          final int _cursorIndexOfIntSpectators = CursorUtil.getColumnIndexOrThrow(_cursor, "intSpectators");
          final int _cursorIndexOfStrAwayFormation = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayFormation");
          final int _cursorIndexOfStrAwayGoalDetails = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayGoalDetails");
          final int _cursorIndexOfStrAwayLineupDefense = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupDefense");
          final int _cursorIndexOfStrAwayLineupForward = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupForward");
          final int _cursorIndexOfStrAwayLineupGoalkeeper = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupGoalkeeper");
          final int _cursorIndexOfStrAwayLineupMidfield = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupMidfield");
          final int _cursorIndexOfStrAwayLineupSubstitutes = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupSubstitutes");
          final int _cursorIndexOfStrAwayRedCards = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayRedCards");
          final int _cursorIndexOfStrAwayTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayTeam");
          final int _cursorIndexOfStrAwayYellowCards = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayYellowCards");
          final int _cursorIndexOfStrBanner = CursorUtil.getColumnIndexOrThrow(_cursor, "strBanner");
          final int _cursorIndexOfStrCircuit = CursorUtil.getColumnIndexOrThrow(_cursor, "strCircuit");
          final int _cursorIndexOfStrCity = CursorUtil.getColumnIndexOrThrow(_cursor, "strCity");
          final int _cursorIndexOfStrCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "strCountry");
          final int _cursorIndexOfStrDate = CursorUtil.getColumnIndexOrThrow(_cursor, "strDate");
          final int _cursorIndexOfStrDescriptionEN = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionEN");
          final int _cursorIndexOfStrEvent = CursorUtil.getColumnIndexOrThrow(_cursor, "strEvent");
          final int _cursorIndexOfStrFanart = CursorUtil.getColumnIndexOrThrow(_cursor, "strFanart");
          final int _cursorIndexOfStrFilename = CursorUtil.getColumnIndexOrThrow(_cursor, "strFilename");
          final int _cursorIndexOfStrHomeFormation = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeFormation");
          final int _cursorIndexOfStrHomeGoalDetails = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeGoalDetails");
          final int _cursorIndexOfStrHomeLineupDefense = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupDefense");
          final int _cursorIndexOfStrHomeLineupForward = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupForward");
          final int _cursorIndexOfStrHomeLineupGoalkeeper = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupGoalkeeper");
          final int _cursorIndexOfStrHomeLineupMidfield = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupMidfield");
          final int _cursorIndexOfStrHomeLineupSubstitutes = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupSubstitutes");
          final int _cursorIndexOfStrHomeRedCards = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeRedCards");
          final int _cursorIndexOfStrHomeTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeTeam");
          final int _cursorIndexOfStrHomeYellowCards = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeYellowCards");
          final int _cursorIndexOfStrLeague = CursorUtil.getColumnIndexOrThrow(_cursor, "strLeague");
          final int _cursorIndexOfStrLocked = CursorUtil.getColumnIndexOrThrow(_cursor, "strLocked");
          final int _cursorIndexOfStrMap = CursorUtil.getColumnIndexOrThrow(_cursor, "strMap");
          final int _cursorIndexOfStrPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "strPoster");
          final int _cursorIndexOfStrResult = CursorUtil.getColumnIndexOrThrow(_cursor, "strResult");
          final int _cursorIndexOfStrSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "strSeason");
          final int _cursorIndexOfStrSport = CursorUtil.getColumnIndexOrThrow(_cursor, "strSport");
          final int _cursorIndexOfStrTVStation = CursorUtil.getColumnIndexOrThrow(_cursor, "strTVStation");
          final int _cursorIndexOfStrThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "strThumb");
          final int _cursorIndexOfStrTime = CursorUtil.getColumnIndexOrThrow(_cursor, "strTime");
          final Match _result;
          if(_cursor.moveToFirst()) {
            final String _tmpIdEvent;
            _tmpIdEvent = _cursor.getString(_cursorIndexOfIdEvent);
            final String _tmpDateEvent;
            _tmpDateEvent = _cursor.getString(_cursorIndexOfDateEvent);
            final String _tmpIdAwayTeam;
            _tmpIdAwayTeam = _cursor.getString(_cursorIndexOfIdAwayTeam);
            final String _tmpIdHomeTeam;
            _tmpIdHomeTeam = _cursor.getString(_cursorIndexOfIdHomeTeam);
            final String _tmpIdLeague;
            _tmpIdLeague = _cursor.getString(_cursorIndexOfIdLeague);
            final String _tmpIdSoccerXML;
            _tmpIdSoccerXML = _cursor.getString(_cursorIndexOfIdSoccerXML);
            final String _tmpIntAwayScore;
            _tmpIntAwayScore = _cursor.getString(_cursorIndexOfIntAwayScore);
            final String _tmpIntAwayShots;
            _tmpIntAwayShots = _cursor.getString(_cursorIndexOfIntAwayShots);
            final String _tmpIntHomeScore;
            _tmpIntHomeScore = _cursor.getString(_cursorIndexOfIntHomeScore);
            final String _tmpIntHomeShots;
            _tmpIntHomeShots = _cursor.getString(_cursorIndexOfIntHomeShots);
            final String _tmpIntRound;
            _tmpIntRound = _cursor.getString(_cursorIndexOfIntRound);
            final String _tmpIntSpectators;
            _tmpIntSpectators = _cursor.getString(_cursorIndexOfIntSpectators);
            final String _tmpStrAwayFormation;
            _tmpStrAwayFormation = _cursor.getString(_cursorIndexOfStrAwayFormation);
            final String _tmpStrAwayGoalDetails;
            _tmpStrAwayGoalDetails = _cursor.getString(_cursorIndexOfStrAwayGoalDetails);
            final String _tmpStrAwayLineupDefense;
            _tmpStrAwayLineupDefense = _cursor.getString(_cursorIndexOfStrAwayLineupDefense);
            final String _tmpStrAwayLineupForward;
            _tmpStrAwayLineupForward = _cursor.getString(_cursorIndexOfStrAwayLineupForward);
            final String _tmpStrAwayLineupGoalkeeper;
            _tmpStrAwayLineupGoalkeeper = _cursor.getString(_cursorIndexOfStrAwayLineupGoalkeeper);
            final String _tmpStrAwayLineupMidfield;
            _tmpStrAwayLineupMidfield = _cursor.getString(_cursorIndexOfStrAwayLineupMidfield);
            final String _tmpStrAwayLineupSubstitutes;
            _tmpStrAwayLineupSubstitutes = _cursor.getString(_cursorIndexOfStrAwayLineupSubstitutes);
            final String _tmpStrAwayRedCards;
            _tmpStrAwayRedCards = _cursor.getString(_cursorIndexOfStrAwayRedCards);
            final String _tmpStrAwayTeam;
            _tmpStrAwayTeam = _cursor.getString(_cursorIndexOfStrAwayTeam);
            final String _tmpStrAwayYellowCards;
            _tmpStrAwayYellowCards = _cursor.getString(_cursorIndexOfStrAwayYellowCards);
            final String _tmpStrBanner;
            _tmpStrBanner = _cursor.getString(_cursorIndexOfStrBanner);
            final String _tmpStrCircuit;
            _tmpStrCircuit = _cursor.getString(_cursorIndexOfStrCircuit);
            final String _tmpStrCity;
            _tmpStrCity = _cursor.getString(_cursorIndexOfStrCity);
            final String _tmpStrCountry;
            _tmpStrCountry = _cursor.getString(_cursorIndexOfStrCountry);
            final String _tmpStrDate;
            _tmpStrDate = _cursor.getString(_cursorIndexOfStrDate);
            final String _tmpStrDescriptionEN;
            _tmpStrDescriptionEN = _cursor.getString(_cursorIndexOfStrDescriptionEN);
            final String _tmpStrEvent;
            _tmpStrEvent = _cursor.getString(_cursorIndexOfStrEvent);
            final String _tmpStrFanart;
            _tmpStrFanart = _cursor.getString(_cursorIndexOfStrFanart);
            final String _tmpStrFilename;
            _tmpStrFilename = _cursor.getString(_cursorIndexOfStrFilename);
            final String _tmpStrHomeFormation;
            _tmpStrHomeFormation = _cursor.getString(_cursorIndexOfStrHomeFormation);
            final String _tmpStrHomeGoalDetails;
            _tmpStrHomeGoalDetails = _cursor.getString(_cursorIndexOfStrHomeGoalDetails);
            final String _tmpStrHomeLineupDefense;
            _tmpStrHomeLineupDefense = _cursor.getString(_cursorIndexOfStrHomeLineupDefense);
            final String _tmpStrHomeLineupForward;
            _tmpStrHomeLineupForward = _cursor.getString(_cursorIndexOfStrHomeLineupForward);
            final String _tmpStrHomeLineupGoalkeeper;
            _tmpStrHomeLineupGoalkeeper = _cursor.getString(_cursorIndexOfStrHomeLineupGoalkeeper);
            final String _tmpStrHomeLineupMidfield;
            _tmpStrHomeLineupMidfield = _cursor.getString(_cursorIndexOfStrHomeLineupMidfield);
            final String _tmpStrHomeLineupSubstitutes;
            _tmpStrHomeLineupSubstitutes = _cursor.getString(_cursorIndexOfStrHomeLineupSubstitutes);
            final String _tmpStrHomeRedCards;
            _tmpStrHomeRedCards = _cursor.getString(_cursorIndexOfStrHomeRedCards);
            final String _tmpStrHomeTeam;
            _tmpStrHomeTeam = _cursor.getString(_cursorIndexOfStrHomeTeam);
            final String _tmpStrHomeYellowCards;
            _tmpStrHomeYellowCards = _cursor.getString(_cursorIndexOfStrHomeYellowCards);
            final String _tmpStrLeague;
            _tmpStrLeague = _cursor.getString(_cursorIndexOfStrLeague);
            final String _tmpStrLocked;
            _tmpStrLocked = _cursor.getString(_cursorIndexOfStrLocked);
            final String _tmpStrMap;
            _tmpStrMap = _cursor.getString(_cursorIndexOfStrMap);
            final String _tmpStrPoster;
            _tmpStrPoster = _cursor.getString(_cursorIndexOfStrPoster);
            final String _tmpStrResult;
            _tmpStrResult = _cursor.getString(_cursorIndexOfStrResult);
            final String _tmpStrSeason;
            _tmpStrSeason = _cursor.getString(_cursorIndexOfStrSeason);
            final String _tmpStrSport;
            _tmpStrSport = _cursor.getString(_cursorIndexOfStrSport);
            final String _tmpStrTVStation;
            _tmpStrTVStation = _cursor.getString(_cursorIndexOfStrTVStation);
            final String _tmpStrThumb;
            _tmpStrThumb = _cursor.getString(_cursorIndexOfStrThumb);
            final String _tmpStrTime;
            _tmpStrTime = _cursor.getString(_cursorIndexOfStrTime);
            _result = new Match(_tmpIdEvent,_tmpDateEvent,_tmpIdAwayTeam,_tmpIdHomeTeam,_tmpIdLeague,_tmpIdSoccerXML,_tmpIntAwayScore,_tmpIntAwayShots,_tmpIntHomeScore,_tmpIntHomeShots,_tmpIntRound,_tmpIntSpectators,_tmpStrAwayFormation,_tmpStrAwayGoalDetails,_tmpStrAwayLineupDefense,_tmpStrAwayLineupForward,_tmpStrAwayLineupGoalkeeper,_tmpStrAwayLineupMidfield,_tmpStrAwayLineupSubstitutes,_tmpStrAwayRedCards,_tmpStrAwayTeam,_tmpStrAwayYellowCards,_tmpStrBanner,_tmpStrCircuit,_tmpStrCity,_tmpStrCountry,_tmpStrDate,_tmpStrDescriptionEN,_tmpStrEvent,_tmpStrFanart,_tmpStrFilename,_tmpStrHomeFormation,_tmpStrHomeGoalDetails,_tmpStrHomeLineupDefense,_tmpStrHomeLineupForward,_tmpStrHomeLineupGoalkeeper,_tmpStrHomeLineupMidfield,_tmpStrHomeLineupSubstitutes,_tmpStrHomeRedCards,_tmpStrHomeTeam,_tmpStrHomeYellowCards,_tmpStrLeague,_tmpStrLocked,_tmpStrMap,_tmpStrPoster,_tmpStrResult,_tmpStrSeason,_tmpStrSport,_tmpStrTVStation,_tmpStrThumb,_tmpStrTime);
            final String _tmpMatchType;
            _tmpMatchType = _cursor.getString(_cursorIndexOfMatchType);
            _result.setMatchType(_tmpMatchType);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Player>> getPlayers(final String teamId) {
    final String _sql = "SELECT * FROM players WHERE idTeam = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (teamId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, teamId);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"players"}, new Callable<List<Player>>() {
      @Override
      public List<Player> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfIdPlayer = CursorUtil.getColumnIndexOrThrow(_cursor, "idPlayer");
          final int _cursorIndexOfIdTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "idTeam");
          final int _cursorIndexOfDateBorn = CursorUtil.getColumnIndexOrThrow(_cursor, "dateBorn");
          final int _cursorIndexOfDateSigned = CursorUtil.getColumnIndexOrThrow(_cursor, "dateSigned");
          final int _cursorIndexOfIdPlayerManager = CursorUtil.getColumnIndexOrThrow(_cursor, "idPlayerManager");
          final int _cursorIndexOfIdSoccerXML = CursorUtil.getColumnIndexOrThrow(_cursor, "idSoccerXML");
          final int _cursorIndexOfIntLoved = CursorUtil.getColumnIndexOrThrow(_cursor, "intLoved");
          final int _cursorIndexOfIntSoccerXMLTeamID = CursorUtil.getColumnIndexOrThrow(_cursor, "intSoccerXMLTeamID");
          final int _cursorIndexOfStrBanner = CursorUtil.getColumnIndexOrThrow(_cursor, "strBanner");
          final int _cursorIndexOfStrBirthLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "strBirthLocation");
          final int _cursorIndexOfStrCollege = CursorUtil.getColumnIndexOrThrow(_cursor, "strCollege");
          final int _cursorIndexOfStrCutout = CursorUtil.getColumnIndexOrThrow(_cursor, "strCutout");
          final int _cursorIndexOfStrDescriptionCN = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionCN");
          final int _cursorIndexOfStrDescriptionDE = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionDE");
          final int _cursorIndexOfStrDescriptionEN = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionEN");
          final int _cursorIndexOfStrDescriptionES = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionES");
          final int _cursorIndexOfStrDescriptionFR = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionFR");
          final int _cursorIndexOfStrDescriptionHU = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionHU");
          final int _cursorIndexOfStrDescriptionIL = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionIL");
          final int _cursorIndexOfStrDescriptionIT = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionIT");
          final int _cursorIndexOfStrDescriptionJP = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionJP");
          final int _cursorIndexOfStrDescriptionNL = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionNL");
          final int _cursorIndexOfStrDescriptionNO = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionNO");
          final int _cursorIndexOfStrDescriptionPL = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionPL");
          final int _cursorIndexOfStrDescriptionPT = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionPT");
          final int _cursorIndexOfStrDescriptionRU = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionRU");
          final int _cursorIndexOfStrDescriptionSE = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionSE");
          final int _cursorIndexOfStrFacebook = CursorUtil.getColumnIndexOrThrow(_cursor, "strFacebook");
          final int _cursorIndexOfStrFanart1 = CursorUtil.getColumnIndexOrThrow(_cursor, "strFanart1");
          final int _cursorIndexOfStrFanart2 = CursorUtil.getColumnIndexOrThrow(_cursor, "strFanart2");
          final int _cursorIndexOfStrFanart3 = CursorUtil.getColumnIndexOrThrow(_cursor, "strFanart3");
          final int _cursorIndexOfStrFanart4 = CursorUtil.getColumnIndexOrThrow(_cursor, "strFanart4");
          final int _cursorIndexOfStrGender = CursorUtil.getColumnIndexOrThrow(_cursor, "strGender");
          final int _cursorIndexOfStrHeight = CursorUtil.getColumnIndexOrThrow(_cursor, "strHeight");
          final int _cursorIndexOfStrInstagram = CursorUtil.getColumnIndexOrThrow(_cursor, "strInstagram");
          final int _cursorIndexOfStrLocked = CursorUtil.getColumnIndexOrThrow(_cursor, "strLocked");
          final int _cursorIndexOfStrNationality = CursorUtil.getColumnIndexOrThrow(_cursor, "strNationality");
          final int _cursorIndexOfStrPlayer = CursorUtil.getColumnIndexOrThrow(_cursor, "strPlayer");
          final int _cursorIndexOfStrPosition = CursorUtil.getColumnIndexOrThrow(_cursor, "strPosition");
          final int _cursorIndexOfStrSigning = CursorUtil.getColumnIndexOrThrow(_cursor, "strSigning");
          final int _cursorIndexOfStrSport = CursorUtil.getColumnIndexOrThrow(_cursor, "strSport");
          final int _cursorIndexOfStrTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeam");
          final int _cursorIndexOfStrThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "strThumb");
          final int _cursorIndexOfStrTwitter = CursorUtil.getColumnIndexOrThrow(_cursor, "strTwitter");
          final int _cursorIndexOfStrWage = CursorUtil.getColumnIndexOrThrow(_cursor, "strWage");
          final int _cursorIndexOfStrWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "strWebsite");
          final int _cursorIndexOfStrWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "strWeight");
          final int _cursorIndexOfStrYoutube = CursorUtil.getColumnIndexOrThrow(_cursor, "strYoutube");
          final List<Player> _result = new ArrayList<Player>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Player _item;
            final String _tmpIdPlayer;
            _tmpIdPlayer = _cursor.getString(_cursorIndexOfIdPlayer);
            final String _tmpIdTeam;
            _tmpIdTeam = _cursor.getString(_cursorIndexOfIdTeam);
            final String _tmpDateBorn;
            _tmpDateBorn = _cursor.getString(_cursorIndexOfDateBorn);
            final String _tmpDateSigned;
            _tmpDateSigned = _cursor.getString(_cursorIndexOfDateSigned);
            final String _tmpIdPlayerManager;
            _tmpIdPlayerManager = _cursor.getString(_cursorIndexOfIdPlayerManager);
            final String _tmpIdSoccerXML;
            _tmpIdSoccerXML = _cursor.getString(_cursorIndexOfIdSoccerXML);
            final String _tmpIntLoved;
            _tmpIntLoved = _cursor.getString(_cursorIndexOfIntLoved);
            final String _tmpIntSoccerXMLTeamID;
            _tmpIntSoccerXMLTeamID = _cursor.getString(_cursorIndexOfIntSoccerXMLTeamID);
            final String _tmpStrBanner;
            _tmpStrBanner = _cursor.getString(_cursorIndexOfStrBanner);
            final String _tmpStrBirthLocation;
            _tmpStrBirthLocation = _cursor.getString(_cursorIndexOfStrBirthLocation);
            final String _tmpStrCollege;
            _tmpStrCollege = _cursor.getString(_cursorIndexOfStrCollege);
            final String _tmpStrCutout;
            _tmpStrCutout = _cursor.getString(_cursorIndexOfStrCutout);
            final String _tmpStrDescriptionCN;
            _tmpStrDescriptionCN = _cursor.getString(_cursorIndexOfStrDescriptionCN);
            final String _tmpStrDescriptionDE;
            _tmpStrDescriptionDE = _cursor.getString(_cursorIndexOfStrDescriptionDE);
            final String _tmpStrDescriptionEN;
            _tmpStrDescriptionEN = _cursor.getString(_cursorIndexOfStrDescriptionEN);
            final String _tmpStrDescriptionES;
            _tmpStrDescriptionES = _cursor.getString(_cursorIndexOfStrDescriptionES);
            final String _tmpStrDescriptionFR;
            _tmpStrDescriptionFR = _cursor.getString(_cursorIndexOfStrDescriptionFR);
            final String _tmpStrDescriptionHU;
            _tmpStrDescriptionHU = _cursor.getString(_cursorIndexOfStrDescriptionHU);
            final String _tmpStrDescriptionIL;
            _tmpStrDescriptionIL = _cursor.getString(_cursorIndexOfStrDescriptionIL);
            final String _tmpStrDescriptionIT;
            _tmpStrDescriptionIT = _cursor.getString(_cursorIndexOfStrDescriptionIT);
            final String _tmpStrDescriptionJP;
            _tmpStrDescriptionJP = _cursor.getString(_cursorIndexOfStrDescriptionJP);
            final String _tmpStrDescriptionNL;
            _tmpStrDescriptionNL = _cursor.getString(_cursorIndexOfStrDescriptionNL);
            final String _tmpStrDescriptionNO;
            _tmpStrDescriptionNO = _cursor.getString(_cursorIndexOfStrDescriptionNO);
            final String _tmpStrDescriptionPL;
            _tmpStrDescriptionPL = _cursor.getString(_cursorIndexOfStrDescriptionPL);
            final String _tmpStrDescriptionPT;
            _tmpStrDescriptionPT = _cursor.getString(_cursorIndexOfStrDescriptionPT);
            final String _tmpStrDescriptionRU;
            _tmpStrDescriptionRU = _cursor.getString(_cursorIndexOfStrDescriptionRU);
            final String _tmpStrDescriptionSE;
            _tmpStrDescriptionSE = _cursor.getString(_cursorIndexOfStrDescriptionSE);
            final String _tmpStrFacebook;
            _tmpStrFacebook = _cursor.getString(_cursorIndexOfStrFacebook);
            final String _tmpStrFanart1;
            _tmpStrFanart1 = _cursor.getString(_cursorIndexOfStrFanart1);
            final String _tmpStrFanart2;
            _tmpStrFanart2 = _cursor.getString(_cursorIndexOfStrFanart2);
            final String _tmpStrFanart3;
            _tmpStrFanart3 = _cursor.getString(_cursorIndexOfStrFanart3);
            final String _tmpStrFanart4;
            _tmpStrFanart4 = _cursor.getString(_cursorIndexOfStrFanart4);
            final String _tmpStrGender;
            _tmpStrGender = _cursor.getString(_cursorIndexOfStrGender);
            final String _tmpStrHeight;
            _tmpStrHeight = _cursor.getString(_cursorIndexOfStrHeight);
            final String _tmpStrInstagram;
            _tmpStrInstagram = _cursor.getString(_cursorIndexOfStrInstagram);
            final String _tmpStrLocked;
            _tmpStrLocked = _cursor.getString(_cursorIndexOfStrLocked);
            final String _tmpStrNationality;
            _tmpStrNationality = _cursor.getString(_cursorIndexOfStrNationality);
            final String _tmpStrPlayer;
            _tmpStrPlayer = _cursor.getString(_cursorIndexOfStrPlayer);
            final String _tmpStrPosition;
            _tmpStrPosition = _cursor.getString(_cursorIndexOfStrPosition);
            final String _tmpStrSigning;
            _tmpStrSigning = _cursor.getString(_cursorIndexOfStrSigning);
            final String _tmpStrSport;
            _tmpStrSport = _cursor.getString(_cursorIndexOfStrSport);
            final String _tmpStrTeam;
            _tmpStrTeam = _cursor.getString(_cursorIndexOfStrTeam);
            final String _tmpStrThumb;
            _tmpStrThumb = _cursor.getString(_cursorIndexOfStrThumb);
            final String _tmpStrTwitter;
            _tmpStrTwitter = _cursor.getString(_cursorIndexOfStrTwitter);
            final String _tmpStrWage;
            _tmpStrWage = _cursor.getString(_cursorIndexOfStrWage);
            final String _tmpStrWebsite;
            _tmpStrWebsite = _cursor.getString(_cursorIndexOfStrWebsite);
            final String _tmpStrWeight;
            _tmpStrWeight = _cursor.getString(_cursorIndexOfStrWeight);
            final String _tmpStrYoutube;
            _tmpStrYoutube = _cursor.getString(_cursorIndexOfStrYoutube);
            _item = new Player(_tmpIdPlayer,_tmpIdTeam,_tmpDateBorn,_tmpDateSigned,_tmpIdPlayerManager,_tmpIdSoccerXML,_tmpIntLoved,_tmpIntSoccerXMLTeamID,_tmpStrBanner,_tmpStrBirthLocation,_tmpStrCollege,_tmpStrCutout,_tmpStrDescriptionCN,_tmpStrDescriptionDE,_tmpStrDescriptionEN,_tmpStrDescriptionES,_tmpStrDescriptionFR,_tmpStrDescriptionHU,_tmpStrDescriptionIL,_tmpStrDescriptionIT,_tmpStrDescriptionJP,_tmpStrDescriptionNL,_tmpStrDescriptionNO,_tmpStrDescriptionPL,_tmpStrDescriptionPT,_tmpStrDescriptionRU,_tmpStrDescriptionSE,_tmpStrFacebook,_tmpStrFanart1,_tmpStrFanart2,_tmpStrFanart3,_tmpStrFanart4,_tmpStrGender,_tmpStrHeight,_tmpStrInstagram,_tmpStrLocked,_tmpStrNationality,_tmpStrPlayer,_tmpStrPosition,_tmpStrSigning,_tmpStrSport,_tmpStrTeam,_tmpStrThumb,_tmpStrTwitter,_tmpStrWage,_tmpStrWebsite,_tmpStrWeight,_tmpStrYoutube);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<FavoriteCount> isFavoriteMatch(final String idEvent) {
    final String _sql = "SELECT COUNT(*) as favCount FROM favorite_matches WHERE idMatch = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (idEvent == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, idEvent);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"favorite_matches"}, new Callable<FavoriteCount>() {
      @Override
      public FavoriteCount call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfFavCount = CursorUtil.getColumnIndexOrThrow(_cursor, "favCount");
          final FavoriteCount _result;
          if(_cursor.moveToFirst()) {
            final int _tmpFavCount;
            _tmpFavCount = _cursor.getInt(_cursorIndexOfFavCount);
            _result = new FavoriteCount(_tmpFavCount);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<FavoriteCount> isFavoriteTeam(final String teamId) {
    final String _sql = "SELECT COUNT(*) as favCount FROM favorite_teams WHERE idTeam = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (teamId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, teamId);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"favorite_teams"}, new Callable<FavoriteCount>() {
      @Override
      public FavoriteCount call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfFavCount = CursorUtil.getColumnIndexOrThrow(_cursor, "favCount");
          final FavoriteCount _result;
          if(_cursor.moveToFirst()) {
            final int _tmpFavCount;
            _tmpFavCount = _cursor.getInt(_cursorIndexOfFavCount);
            _result = new FavoriteCount(_tmpFavCount);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Match>> getFavoriteMatches() {
    final String _sql = "SELECT * FROM matches INNER JOIN favorite_matches ON favorite_matches.idMatch = idEvent ORDER BY dateEvent DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"matches","favorite_matches"}, new Callable<List<Match>>() {
      @Override
      public List<Match> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfMatchType = CursorUtil.getColumnIndexOrThrow(_cursor, "matchType");
          final int _cursorIndexOfIdEvent = CursorUtil.getColumnIndexOrThrow(_cursor, "idEvent");
          final int _cursorIndexOfDateEvent = CursorUtil.getColumnIndexOrThrow(_cursor, "dateEvent");
          final int _cursorIndexOfIdAwayTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "idAwayTeam");
          final int _cursorIndexOfIdHomeTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "idHomeTeam");
          final int _cursorIndexOfIdLeague = CursorUtil.getColumnIndexOrThrow(_cursor, "idLeague");
          final int _cursorIndexOfIdSoccerXML = CursorUtil.getColumnIndexOrThrow(_cursor, "idSoccerXML");
          final int _cursorIndexOfIntAwayScore = CursorUtil.getColumnIndexOrThrow(_cursor, "intAwayScore");
          final int _cursorIndexOfIntAwayShots = CursorUtil.getColumnIndexOrThrow(_cursor, "intAwayShots");
          final int _cursorIndexOfIntHomeScore = CursorUtil.getColumnIndexOrThrow(_cursor, "intHomeScore");
          final int _cursorIndexOfIntHomeShots = CursorUtil.getColumnIndexOrThrow(_cursor, "intHomeShots");
          final int _cursorIndexOfIntRound = CursorUtil.getColumnIndexOrThrow(_cursor, "intRound");
          final int _cursorIndexOfIntSpectators = CursorUtil.getColumnIndexOrThrow(_cursor, "intSpectators");
          final int _cursorIndexOfStrAwayFormation = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayFormation");
          final int _cursorIndexOfStrAwayGoalDetails = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayGoalDetails");
          final int _cursorIndexOfStrAwayLineupDefense = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupDefense");
          final int _cursorIndexOfStrAwayLineupForward = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupForward");
          final int _cursorIndexOfStrAwayLineupGoalkeeper = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupGoalkeeper");
          final int _cursorIndexOfStrAwayLineupMidfield = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupMidfield");
          final int _cursorIndexOfStrAwayLineupSubstitutes = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupSubstitutes");
          final int _cursorIndexOfStrAwayRedCards = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayRedCards");
          final int _cursorIndexOfStrAwayTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayTeam");
          final int _cursorIndexOfStrAwayYellowCards = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayYellowCards");
          final int _cursorIndexOfStrBanner = CursorUtil.getColumnIndexOrThrow(_cursor, "strBanner");
          final int _cursorIndexOfStrCircuit = CursorUtil.getColumnIndexOrThrow(_cursor, "strCircuit");
          final int _cursorIndexOfStrCity = CursorUtil.getColumnIndexOrThrow(_cursor, "strCity");
          final int _cursorIndexOfStrCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "strCountry");
          final int _cursorIndexOfStrDate = CursorUtil.getColumnIndexOrThrow(_cursor, "strDate");
          final int _cursorIndexOfStrDescriptionEN = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionEN");
          final int _cursorIndexOfStrEvent = CursorUtil.getColumnIndexOrThrow(_cursor, "strEvent");
          final int _cursorIndexOfStrFanart = CursorUtil.getColumnIndexOrThrow(_cursor, "strFanart");
          final int _cursorIndexOfStrFilename = CursorUtil.getColumnIndexOrThrow(_cursor, "strFilename");
          final int _cursorIndexOfStrHomeFormation = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeFormation");
          final int _cursorIndexOfStrHomeGoalDetails = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeGoalDetails");
          final int _cursorIndexOfStrHomeLineupDefense = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupDefense");
          final int _cursorIndexOfStrHomeLineupForward = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupForward");
          final int _cursorIndexOfStrHomeLineupGoalkeeper = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupGoalkeeper");
          final int _cursorIndexOfStrHomeLineupMidfield = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupMidfield");
          final int _cursorIndexOfStrHomeLineupSubstitutes = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupSubstitutes");
          final int _cursorIndexOfStrHomeRedCards = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeRedCards");
          final int _cursorIndexOfStrHomeTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeTeam");
          final int _cursorIndexOfStrHomeYellowCards = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeYellowCards");
          final int _cursorIndexOfStrLeague = CursorUtil.getColumnIndexOrThrow(_cursor, "strLeague");
          final int _cursorIndexOfStrLocked = CursorUtil.getColumnIndexOrThrow(_cursor, "strLocked");
          final int _cursorIndexOfStrMap = CursorUtil.getColumnIndexOrThrow(_cursor, "strMap");
          final int _cursorIndexOfStrPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "strPoster");
          final int _cursorIndexOfStrResult = CursorUtil.getColumnIndexOrThrow(_cursor, "strResult");
          final int _cursorIndexOfStrSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "strSeason");
          final int _cursorIndexOfStrSport = CursorUtil.getColumnIndexOrThrow(_cursor, "strSport");
          final int _cursorIndexOfStrTVStation = CursorUtil.getColumnIndexOrThrow(_cursor, "strTVStation");
          final int _cursorIndexOfStrThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "strThumb");
          final int _cursorIndexOfStrTime = CursorUtil.getColumnIndexOrThrow(_cursor, "strTime");
          final List<Match> _result = new ArrayList<Match>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Match _item;
            final String _tmpIdEvent;
            _tmpIdEvent = _cursor.getString(_cursorIndexOfIdEvent);
            final String _tmpDateEvent;
            _tmpDateEvent = _cursor.getString(_cursorIndexOfDateEvent);
            final String _tmpIdAwayTeam;
            _tmpIdAwayTeam = _cursor.getString(_cursorIndexOfIdAwayTeam);
            final String _tmpIdHomeTeam;
            _tmpIdHomeTeam = _cursor.getString(_cursorIndexOfIdHomeTeam);
            final String _tmpIdLeague;
            _tmpIdLeague = _cursor.getString(_cursorIndexOfIdLeague);
            final String _tmpIdSoccerXML;
            _tmpIdSoccerXML = _cursor.getString(_cursorIndexOfIdSoccerXML);
            final String _tmpIntAwayScore;
            _tmpIntAwayScore = _cursor.getString(_cursorIndexOfIntAwayScore);
            final String _tmpIntAwayShots;
            _tmpIntAwayShots = _cursor.getString(_cursorIndexOfIntAwayShots);
            final String _tmpIntHomeScore;
            _tmpIntHomeScore = _cursor.getString(_cursorIndexOfIntHomeScore);
            final String _tmpIntHomeShots;
            _tmpIntHomeShots = _cursor.getString(_cursorIndexOfIntHomeShots);
            final String _tmpIntRound;
            _tmpIntRound = _cursor.getString(_cursorIndexOfIntRound);
            final String _tmpIntSpectators;
            _tmpIntSpectators = _cursor.getString(_cursorIndexOfIntSpectators);
            final String _tmpStrAwayFormation;
            _tmpStrAwayFormation = _cursor.getString(_cursorIndexOfStrAwayFormation);
            final String _tmpStrAwayGoalDetails;
            _tmpStrAwayGoalDetails = _cursor.getString(_cursorIndexOfStrAwayGoalDetails);
            final String _tmpStrAwayLineupDefense;
            _tmpStrAwayLineupDefense = _cursor.getString(_cursorIndexOfStrAwayLineupDefense);
            final String _tmpStrAwayLineupForward;
            _tmpStrAwayLineupForward = _cursor.getString(_cursorIndexOfStrAwayLineupForward);
            final String _tmpStrAwayLineupGoalkeeper;
            _tmpStrAwayLineupGoalkeeper = _cursor.getString(_cursorIndexOfStrAwayLineupGoalkeeper);
            final String _tmpStrAwayLineupMidfield;
            _tmpStrAwayLineupMidfield = _cursor.getString(_cursorIndexOfStrAwayLineupMidfield);
            final String _tmpStrAwayLineupSubstitutes;
            _tmpStrAwayLineupSubstitutes = _cursor.getString(_cursorIndexOfStrAwayLineupSubstitutes);
            final String _tmpStrAwayRedCards;
            _tmpStrAwayRedCards = _cursor.getString(_cursorIndexOfStrAwayRedCards);
            final String _tmpStrAwayTeam;
            _tmpStrAwayTeam = _cursor.getString(_cursorIndexOfStrAwayTeam);
            final String _tmpStrAwayYellowCards;
            _tmpStrAwayYellowCards = _cursor.getString(_cursorIndexOfStrAwayYellowCards);
            final String _tmpStrBanner;
            _tmpStrBanner = _cursor.getString(_cursorIndexOfStrBanner);
            final String _tmpStrCircuit;
            _tmpStrCircuit = _cursor.getString(_cursorIndexOfStrCircuit);
            final String _tmpStrCity;
            _tmpStrCity = _cursor.getString(_cursorIndexOfStrCity);
            final String _tmpStrCountry;
            _tmpStrCountry = _cursor.getString(_cursorIndexOfStrCountry);
            final String _tmpStrDate;
            _tmpStrDate = _cursor.getString(_cursorIndexOfStrDate);
            final String _tmpStrDescriptionEN;
            _tmpStrDescriptionEN = _cursor.getString(_cursorIndexOfStrDescriptionEN);
            final String _tmpStrEvent;
            _tmpStrEvent = _cursor.getString(_cursorIndexOfStrEvent);
            final String _tmpStrFanart;
            _tmpStrFanart = _cursor.getString(_cursorIndexOfStrFanart);
            final String _tmpStrFilename;
            _tmpStrFilename = _cursor.getString(_cursorIndexOfStrFilename);
            final String _tmpStrHomeFormation;
            _tmpStrHomeFormation = _cursor.getString(_cursorIndexOfStrHomeFormation);
            final String _tmpStrHomeGoalDetails;
            _tmpStrHomeGoalDetails = _cursor.getString(_cursorIndexOfStrHomeGoalDetails);
            final String _tmpStrHomeLineupDefense;
            _tmpStrHomeLineupDefense = _cursor.getString(_cursorIndexOfStrHomeLineupDefense);
            final String _tmpStrHomeLineupForward;
            _tmpStrHomeLineupForward = _cursor.getString(_cursorIndexOfStrHomeLineupForward);
            final String _tmpStrHomeLineupGoalkeeper;
            _tmpStrHomeLineupGoalkeeper = _cursor.getString(_cursorIndexOfStrHomeLineupGoalkeeper);
            final String _tmpStrHomeLineupMidfield;
            _tmpStrHomeLineupMidfield = _cursor.getString(_cursorIndexOfStrHomeLineupMidfield);
            final String _tmpStrHomeLineupSubstitutes;
            _tmpStrHomeLineupSubstitutes = _cursor.getString(_cursorIndexOfStrHomeLineupSubstitutes);
            final String _tmpStrHomeRedCards;
            _tmpStrHomeRedCards = _cursor.getString(_cursorIndexOfStrHomeRedCards);
            final String _tmpStrHomeTeam;
            _tmpStrHomeTeam = _cursor.getString(_cursorIndexOfStrHomeTeam);
            final String _tmpStrHomeYellowCards;
            _tmpStrHomeYellowCards = _cursor.getString(_cursorIndexOfStrHomeYellowCards);
            final String _tmpStrLeague;
            _tmpStrLeague = _cursor.getString(_cursorIndexOfStrLeague);
            final String _tmpStrLocked;
            _tmpStrLocked = _cursor.getString(_cursorIndexOfStrLocked);
            final String _tmpStrMap;
            _tmpStrMap = _cursor.getString(_cursorIndexOfStrMap);
            final String _tmpStrPoster;
            _tmpStrPoster = _cursor.getString(_cursorIndexOfStrPoster);
            final String _tmpStrResult;
            _tmpStrResult = _cursor.getString(_cursorIndexOfStrResult);
            final String _tmpStrSeason;
            _tmpStrSeason = _cursor.getString(_cursorIndexOfStrSeason);
            final String _tmpStrSport;
            _tmpStrSport = _cursor.getString(_cursorIndexOfStrSport);
            final String _tmpStrTVStation;
            _tmpStrTVStation = _cursor.getString(_cursorIndexOfStrTVStation);
            final String _tmpStrThumb;
            _tmpStrThumb = _cursor.getString(_cursorIndexOfStrThumb);
            final String _tmpStrTime;
            _tmpStrTime = _cursor.getString(_cursorIndexOfStrTime);
            _item = new Match(_tmpIdEvent,_tmpDateEvent,_tmpIdAwayTeam,_tmpIdHomeTeam,_tmpIdLeague,_tmpIdSoccerXML,_tmpIntAwayScore,_tmpIntAwayShots,_tmpIntHomeScore,_tmpIntHomeShots,_tmpIntRound,_tmpIntSpectators,_tmpStrAwayFormation,_tmpStrAwayGoalDetails,_tmpStrAwayLineupDefense,_tmpStrAwayLineupForward,_tmpStrAwayLineupGoalkeeper,_tmpStrAwayLineupMidfield,_tmpStrAwayLineupSubstitutes,_tmpStrAwayRedCards,_tmpStrAwayTeam,_tmpStrAwayYellowCards,_tmpStrBanner,_tmpStrCircuit,_tmpStrCity,_tmpStrCountry,_tmpStrDate,_tmpStrDescriptionEN,_tmpStrEvent,_tmpStrFanart,_tmpStrFilename,_tmpStrHomeFormation,_tmpStrHomeGoalDetails,_tmpStrHomeLineupDefense,_tmpStrHomeLineupForward,_tmpStrHomeLineupGoalkeeper,_tmpStrHomeLineupMidfield,_tmpStrHomeLineupSubstitutes,_tmpStrHomeRedCards,_tmpStrHomeTeam,_tmpStrHomeYellowCards,_tmpStrLeague,_tmpStrLocked,_tmpStrMap,_tmpStrPoster,_tmpStrResult,_tmpStrSeason,_tmpStrSport,_tmpStrTVStation,_tmpStrThumb,_tmpStrTime);
            final String _tmpMatchType;
            _tmpMatchType = _cursor.getString(_cursorIndexOfMatchType);
            _item.setMatchType(_tmpMatchType);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Team>> getFavoriteTeams() {
    final String _sql = "SELECT * FROM teams INNER JOIN favorite_teams ON favorite_teams.idTeam = teams.idTeam";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"teams","favorite_teams"}, new Callable<List<Team>>() {
      @Override
      public List<Team> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfIdLeague = CursorUtil.getColumnIndexOrThrow(_cursor, "idLeague");
          final int _cursorIndexOfIdTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "idTeam");
          final int _cursorIndexOfIdSoccerXML = CursorUtil.getColumnIndexOrThrow(_cursor, "idSoccerXML");
          final int _cursorIndexOfIntFormedYear = CursorUtil.getColumnIndexOrThrow(_cursor, "intFormedYear");
          final int _cursorIndexOfIntLoved = CursorUtil.getColumnIndexOrThrow(_cursor, "intLoved");
          final int _cursorIndexOfIntStadiumCapacity = CursorUtil.getColumnIndexOrThrow(_cursor, "intStadiumCapacity");
          final int _cursorIndexOfStrAlternate = CursorUtil.getColumnIndexOrThrow(_cursor, "strAlternate");
          final int _cursorIndexOfStrCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "strCountry");
          final int _cursorIndexOfStrDescriptionCN = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionCN");
          final int _cursorIndexOfStrDescriptionDE = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionDE");
          final int _cursorIndexOfStrDescriptionEN = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionEN");
          final int _cursorIndexOfStrDescriptionES = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionES");
          final int _cursorIndexOfStrDescriptionFR = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionFR");
          final int _cursorIndexOfStrDescriptionHU = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionHU");
          final int _cursorIndexOfStrDescriptionIL = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionIL");
          final int _cursorIndexOfStrDescriptionIT = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionIT");
          final int _cursorIndexOfStrDescriptionJP = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionJP");
          final int _cursorIndexOfStrDescriptionNL = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionNL");
          final int _cursorIndexOfStrDescriptionNO = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionNO");
          final int _cursorIndexOfStrDescriptionPL = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionPL");
          final int _cursorIndexOfStrDescriptionPT = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionPT");
          final int _cursorIndexOfStrDescriptionRU = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionRU");
          final int _cursorIndexOfStrDescriptionSE = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionSE");
          final int _cursorIndexOfStrDivision = CursorUtil.getColumnIndexOrThrow(_cursor, "strDivision");
          final int _cursorIndexOfStrFacebook = CursorUtil.getColumnIndexOrThrow(_cursor, "strFacebook");
          final int _cursorIndexOfStrGender = CursorUtil.getColumnIndexOrThrow(_cursor, "strGender");
          final int _cursorIndexOfStrInstagram = CursorUtil.getColumnIndexOrThrow(_cursor, "strInstagram");
          final int _cursorIndexOfStrKeywords = CursorUtil.getColumnIndexOrThrow(_cursor, "strKeywords");
          final int _cursorIndexOfStrLeague = CursorUtil.getColumnIndexOrThrow(_cursor, "strLeague");
          final int _cursorIndexOfStrLocked = CursorUtil.getColumnIndexOrThrow(_cursor, "strLocked");
          final int _cursorIndexOfStrManager = CursorUtil.getColumnIndexOrThrow(_cursor, "strManager");
          final int _cursorIndexOfStrRSS = CursorUtil.getColumnIndexOrThrow(_cursor, "strRSS");
          final int _cursorIndexOfStrSport = CursorUtil.getColumnIndexOrThrow(_cursor, "strSport");
          final int _cursorIndexOfStrStadium = CursorUtil.getColumnIndexOrThrow(_cursor, "strStadium");
          final int _cursorIndexOfStrStadiumDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "strStadiumDescription");
          final int _cursorIndexOfStrStadiumLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "strStadiumLocation");
          final int _cursorIndexOfStrStadiumThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "strStadiumThumb");
          final int _cursorIndexOfStrTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeam");
          final int _cursorIndexOfStrTeamBadge = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamBadge");
          final int _cursorIndexOfStrTeamBanner = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamBanner");
          final int _cursorIndexOfStrTeamFanart1 = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamFanart1");
          final int _cursorIndexOfStrTeamFanart2 = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamFanart2");
          final int _cursorIndexOfStrTeamFanart3 = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamFanart3");
          final int _cursorIndexOfStrTeamFanart4 = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamFanart4");
          final int _cursorIndexOfStrTeamJersey = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamJersey");
          final int _cursorIndexOfStrTeamLogo = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamLogo");
          final int _cursorIndexOfStrTeamShort = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamShort");
          final int _cursorIndexOfStrTwitter = CursorUtil.getColumnIndexOrThrow(_cursor, "strTwitter");
          final int _cursorIndexOfStrWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "strWebsite");
          final int _cursorIndexOfStrYoutube = CursorUtil.getColumnIndexOrThrow(_cursor, "strYoutube");
          final int _cursorIndexOfIdTeam_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "idTeam");
          final List<Team> _result = new ArrayList<Team>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Team _item;
            final String _tmpIdLeague;
            _tmpIdLeague = _cursor.getString(_cursorIndexOfIdLeague);
            final String _tmpIdTeam;
            _tmpIdTeam = _cursor.getString(_cursorIndexOfIdTeam);
            final String _tmpIdSoccerXML;
            _tmpIdSoccerXML = _cursor.getString(_cursorIndexOfIdSoccerXML);
            final String _tmpIntFormedYear;
            _tmpIntFormedYear = _cursor.getString(_cursorIndexOfIntFormedYear);
            final String _tmpIntLoved;
            _tmpIntLoved = _cursor.getString(_cursorIndexOfIntLoved);
            final String _tmpIntStadiumCapacity;
            _tmpIntStadiumCapacity = _cursor.getString(_cursorIndexOfIntStadiumCapacity);
            final String _tmpStrAlternate;
            _tmpStrAlternate = _cursor.getString(_cursorIndexOfStrAlternate);
            final String _tmpStrCountry;
            _tmpStrCountry = _cursor.getString(_cursorIndexOfStrCountry);
            final String _tmpStrDescriptionCN;
            _tmpStrDescriptionCN = _cursor.getString(_cursorIndexOfStrDescriptionCN);
            final String _tmpStrDescriptionDE;
            _tmpStrDescriptionDE = _cursor.getString(_cursorIndexOfStrDescriptionDE);
            final String _tmpStrDescriptionEN;
            _tmpStrDescriptionEN = _cursor.getString(_cursorIndexOfStrDescriptionEN);
            final String _tmpStrDescriptionES;
            _tmpStrDescriptionES = _cursor.getString(_cursorIndexOfStrDescriptionES);
            final String _tmpStrDescriptionFR;
            _tmpStrDescriptionFR = _cursor.getString(_cursorIndexOfStrDescriptionFR);
            final String _tmpStrDescriptionHU;
            _tmpStrDescriptionHU = _cursor.getString(_cursorIndexOfStrDescriptionHU);
            final String _tmpStrDescriptionIL;
            _tmpStrDescriptionIL = _cursor.getString(_cursorIndexOfStrDescriptionIL);
            final String _tmpStrDescriptionIT;
            _tmpStrDescriptionIT = _cursor.getString(_cursorIndexOfStrDescriptionIT);
            final String _tmpStrDescriptionJP;
            _tmpStrDescriptionJP = _cursor.getString(_cursorIndexOfStrDescriptionJP);
            final String _tmpStrDescriptionNL;
            _tmpStrDescriptionNL = _cursor.getString(_cursorIndexOfStrDescriptionNL);
            final String _tmpStrDescriptionNO;
            _tmpStrDescriptionNO = _cursor.getString(_cursorIndexOfStrDescriptionNO);
            final String _tmpStrDescriptionPL;
            _tmpStrDescriptionPL = _cursor.getString(_cursorIndexOfStrDescriptionPL);
            final String _tmpStrDescriptionPT;
            _tmpStrDescriptionPT = _cursor.getString(_cursorIndexOfStrDescriptionPT);
            final String _tmpStrDescriptionRU;
            _tmpStrDescriptionRU = _cursor.getString(_cursorIndexOfStrDescriptionRU);
            final String _tmpStrDescriptionSE;
            _tmpStrDescriptionSE = _cursor.getString(_cursorIndexOfStrDescriptionSE);
            final String _tmpStrDivision;
            _tmpStrDivision = _cursor.getString(_cursorIndexOfStrDivision);
            final String _tmpStrFacebook;
            _tmpStrFacebook = _cursor.getString(_cursorIndexOfStrFacebook);
            final String _tmpStrGender;
            _tmpStrGender = _cursor.getString(_cursorIndexOfStrGender);
            final String _tmpStrInstagram;
            _tmpStrInstagram = _cursor.getString(_cursorIndexOfStrInstagram);
            final String _tmpStrKeywords;
            _tmpStrKeywords = _cursor.getString(_cursorIndexOfStrKeywords);
            final String _tmpStrLeague;
            _tmpStrLeague = _cursor.getString(_cursorIndexOfStrLeague);
            final String _tmpStrLocked;
            _tmpStrLocked = _cursor.getString(_cursorIndexOfStrLocked);
            final String _tmpStrManager;
            _tmpStrManager = _cursor.getString(_cursorIndexOfStrManager);
            final String _tmpStrRSS;
            _tmpStrRSS = _cursor.getString(_cursorIndexOfStrRSS);
            final String _tmpStrSport;
            _tmpStrSport = _cursor.getString(_cursorIndexOfStrSport);
            final String _tmpStrStadium;
            _tmpStrStadium = _cursor.getString(_cursorIndexOfStrStadium);
            final String _tmpStrStadiumDescription;
            _tmpStrStadiumDescription = _cursor.getString(_cursorIndexOfStrStadiumDescription);
            final String _tmpStrStadiumLocation;
            _tmpStrStadiumLocation = _cursor.getString(_cursorIndexOfStrStadiumLocation);
            final String _tmpStrStadiumThumb;
            _tmpStrStadiumThumb = _cursor.getString(_cursorIndexOfStrStadiumThumb);
            final String _tmpStrTeam;
            _tmpStrTeam = _cursor.getString(_cursorIndexOfStrTeam);
            final String _tmpStrTeamBadge;
            _tmpStrTeamBadge = _cursor.getString(_cursorIndexOfStrTeamBadge);
            final String _tmpStrTeamBanner;
            _tmpStrTeamBanner = _cursor.getString(_cursorIndexOfStrTeamBanner);
            final String _tmpStrTeamFanart1;
            _tmpStrTeamFanart1 = _cursor.getString(_cursorIndexOfStrTeamFanart1);
            final String _tmpStrTeamFanart2;
            _tmpStrTeamFanart2 = _cursor.getString(_cursorIndexOfStrTeamFanart2);
            final String _tmpStrTeamFanart3;
            _tmpStrTeamFanart3 = _cursor.getString(_cursorIndexOfStrTeamFanart3);
            final String _tmpStrTeamFanart4;
            _tmpStrTeamFanart4 = _cursor.getString(_cursorIndexOfStrTeamFanart4);
            final String _tmpStrTeamJersey;
            _tmpStrTeamJersey = _cursor.getString(_cursorIndexOfStrTeamJersey);
            final String _tmpStrTeamLogo;
            _tmpStrTeamLogo = _cursor.getString(_cursorIndexOfStrTeamLogo);
            final String _tmpStrTeamShort;
            _tmpStrTeamShort = _cursor.getString(_cursorIndexOfStrTeamShort);
            final String _tmpStrTwitter;
            _tmpStrTwitter = _cursor.getString(_cursorIndexOfStrTwitter);
            final String _tmpStrWebsite;
            _tmpStrWebsite = _cursor.getString(_cursorIndexOfStrWebsite);
            final String _tmpStrYoutube;
            _tmpStrYoutube = _cursor.getString(_cursorIndexOfStrYoutube);
            final String _tmpIdTeam_1;
            _tmpIdTeam_1 = _cursor.getString(_cursorIndexOfIdTeam_1);
            _item = new Team(_tmpIdLeague,_tmpIdTeam,_tmpIdSoccerXML,_tmpIntFormedYear,_tmpIntLoved,_tmpIntStadiumCapacity,_tmpStrAlternate,_tmpStrCountry,_tmpStrDescriptionCN,_tmpStrDescriptionDE,_tmpStrDescriptionEN,_tmpStrDescriptionES,_tmpStrDescriptionFR,_tmpStrDescriptionHU,_tmpStrDescriptionIL,_tmpStrDescriptionIT,_tmpStrDescriptionJP,_tmpStrDescriptionNL,_tmpStrDescriptionNO,_tmpStrDescriptionPL,_tmpStrDescriptionPT,_tmpStrDescriptionRU,_tmpStrDescriptionSE,_tmpStrDivision,_tmpStrFacebook,_tmpStrGender,_tmpStrInstagram,_tmpStrKeywords,_tmpStrLeague,_tmpStrLocked,_tmpStrManager,_tmpStrRSS,_tmpStrSport,_tmpStrStadium,_tmpStrStadiumDescription,_tmpStrStadiumLocation,_tmpStrStadiumThumb,_tmpStrTeam,_tmpStrTeamBadge,_tmpStrTeamBanner,_tmpStrTeamFanart1,_tmpStrTeamFanart2,_tmpStrTeamFanart3,_tmpStrTeamFanart4,_tmpStrTeamJersey,_tmpStrTeamLogo,_tmpStrTeamShort,_tmpStrTwitter,_tmpStrWebsite,_tmpStrYoutube);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Player> getPlayer(final String playerId) {
    final String _sql = "SELECT * FROM players WHERE idPlayer = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (playerId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, playerId);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"players"}, new Callable<Player>() {
      @Override
      public Player call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfIdPlayer = CursorUtil.getColumnIndexOrThrow(_cursor, "idPlayer");
          final int _cursorIndexOfIdTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "idTeam");
          final int _cursorIndexOfDateBorn = CursorUtil.getColumnIndexOrThrow(_cursor, "dateBorn");
          final int _cursorIndexOfDateSigned = CursorUtil.getColumnIndexOrThrow(_cursor, "dateSigned");
          final int _cursorIndexOfIdPlayerManager = CursorUtil.getColumnIndexOrThrow(_cursor, "idPlayerManager");
          final int _cursorIndexOfIdSoccerXML = CursorUtil.getColumnIndexOrThrow(_cursor, "idSoccerXML");
          final int _cursorIndexOfIntLoved = CursorUtil.getColumnIndexOrThrow(_cursor, "intLoved");
          final int _cursorIndexOfIntSoccerXMLTeamID = CursorUtil.getColumnIndexOrThrow(_cursor, "intSoccerXMLTeamID");
          final int _cursorIndexOfStrBanner = CursorUtil.getColumnIndexOrThrow(_cursor, "strBanner");
          final int _cursorIndexOfStrBirthLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "strBirthLocation");
          final int _cursorIndexOfStrCollege = CursorUtil.getColumnIndexOrThrow(_cursor, "strCollege");
          final int _cursorIndexOfStrCutout = CursorUtil.getColumnIndexOrThrow(_cursor, "strCutout");
          final int _cursorIndexOfStrDescriptionCN = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionCN");
          final int _cursorIndexOfStrDescriptionDE = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionDE");
          final int _cursorIndexOfStrDescriptionEN = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionEN");
          final int _cursorIndexOfStrDescriptionES = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionES");
          final int _cursorIndexOfStrDescriptionFR = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionFR");
          final int _cursorIndexOfStrDescriptionHU = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionHU");
          final int _cursorIndexOfStrDescriptionIL = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionIL");
          final int _cursorIndexOfStrDescriptionIT = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionIT");
          final int _cursorIndexOfStrDescriptionJP = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionJP");
          final int _cursorIndexOfStrDescriptionNL = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionNL");
          final int _cursorIndexOfStrDescriptionNO = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionNO");
          final int _cursorIndexOfStrDescriptionPL = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionPL");
          final int _cursorIndexOfStrDescriptionPT = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionPT");
          final int _cursorIndexOfStrDescriptionRU = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionRU");
          final int _cursorIndexOfStrDescriptionSE = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionSE");
          final int _cursorIndexOfStrFacebook = CursorUtil.getColumnIndexOrThrow(_cursor, "strFacebook");
          final int _cursorIndexOfStrFanart1 = CursorUtil.getColumnIndexOrThrow(_cursor, "strFanart1");
          final int _cursorIndexOfStrFanart2 = CursorUtil.getColumnIndexOrThrow(_cursor, "strFanart2");
          final int _cursorIndexOfStrFanart3 = CursorUtil.getColumnIndexOrThrow(_cursor, "strFanart3");
          final int _cursorIndexOfStrFanart4 = CursorUtil.getColumnIndexOrThrow(_cursor, "strFanart4");
          final int _cursorIndexOfStrGender = CursorUtil.getColumnIndexOrThrow(_cursor, "strGender");
          final int _cursorIndexOfStrHeight = CursorUtil.getColumnIndexOrThrow(_cursor, "strHeight");
          final int _cursorIndexOfStrInstagram = CursorUtil.getColumnIndexOrThrow(_cursor, "strInstagram");
          final int _cursorIndexOfStrLocked = CursorUtil.getColumnIndexOrThrow(_cursor, "strLocked");
          final int _cursorIndexOfStrNationality = CursorUtil.getColumnIndexOrThrow(_cursor, "strNationality");
          final int _cursorIndexOfStrPlayer = CursorUtil.getColumnIndexOrThrow(_cursor, "strPlayer");
          final int _cursorIndexOfStrPosition = CursorUtil.getColumnIndexOrThrow(_cursor, "strPosition");
          final int _cursorIndexOfStrSigning = CursorUtil.getColumnIndexOrThrow(_cursor, "strSigning");
          final int _cursorIndexOfStrSport = CursorUtil.getColumnIndexOrThrow(_cursor, "strSport");
          final int _cursorIndexOfStrTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeam");
          final int _cursorIndexOfStrThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "strThumb");
          final int _cursorIndexOfStrTwitter = CursorUtil.getColumnIndexOrThrow(_cursor, "strTwitter");
          final int _cursorIndexOfStrWage = CursorUtil.getColumnIndexOrThrow(_cursor, "strWage");
          final int _cursorIndexOfStrWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "strWebsite");
          final int _cursorIndexOfStrWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "strWeight");
          final int _cursorIndexOfStrYoutube = CursorUtil.getColumnIndexOrThrow(_cursor, "strYoutube");
          final Player _result;
          if(_cursor.moveToFirst()) {
            final String _tmpIdPlayer;
            _tmpIdPlayer = _cursor.getString(_cursorIndexOfIdPlayer);
            final String _tmpIdTeam;
            _tmpIdTeam = _cursor.getString(_cursorIndexOfIdTeam);
            final String _tmpDateBorn;
            _tmpDateBorn = _cursor.getString(_cursorIndexOfDateBorn);
            final String _tmpDateSigned;
            _tmpDateSigned = _cursor.getString(_cursorIndexOfDateSigned);
            final String _tmpIdPlayerManager;
            _tmpIdPlayerManager = _cursor.getString(_cursorIndexOfIdPlayerManager);
            final String _tmpIdSoccerXML;
            _tmpIdSoccerXML = _cursor.getString(_cursorIndexOfIdSoccerXML);
            final String _tmpIntLoved;
            _tmpIntLoved = _cursor.getString(_cursorIndexOfIntLoved);
            final String _tmpIntSoccerXMLTeamID;
            _tmpIntSoccerXMLTeamID = _cursor.getString(_cursorIndexOfIntSoccerXMLTeamID);
            final String _tmpStrBanner;
            _tmpStrBanner = _cursor.getString(_cursorIndexOfStrBanner);
            final String _tmpStrBirthLocation;
            _tmpStrBirthLocation = _cursor.getString(_cursorIndexOfStrBirthLocation);
            final String _tmpStrCollege;
            _tmpStrCollege = _cursor.getString(_cursorIndexOfStrCollege);
            final String _tmpStrCutout;
            _tmpStrCutout = _cursor.getString(_cursorIndexOfStrCutout);
            final String _tmpStrDescriptionCN;
            _tmpStrDescriptionCN = _cursor.getString(_cursorIndexOfStrDescriptionCN);
            final String _tmpStrDescriptionDE;
            _tmpStrDescriptionDE = _cursor.getString(_cursorIndexOfStrDescriptionDE);
            final String _tmpStrDescriptionEN;
            _tmpStrDescriptionEN = _cursor.getString(_cursorIndexOfStrDescriptionEN);
            final String _tmpStrDescriptionES;
            _tmpStrDescriptionES = _cursor.getString(_cursorIndexOfStrDescriptionES);
            final String _tmpStrDescriptionFR;
            _tmpStrDescriptionFR = _cursor.getString(_cursorIndexOfStrDescriptionFR);
            final String _tmpStrDescriptionHU;
            _tmpStrDescriptionHU = _cursor.getString(_cursorIndexOfStrDescriptionHU);
            final String _tmpStrDescriptionIL;
            _tmpStrDescriptionIL = _cursor.getString(_cursorIndexOfStrDescriptionIL);
            final String _tmpStrDescriptionIT;
            _tmpStrDescriptionIT = _cursor.getString(_cursorIndexOfStrDescriptionIT);
            final String _tmpStrDescriptionJP;
            _tmpStrDescriptionJP = _cursor.getString(_cursorIndexOfStrDescriptionJP);
            final String _tmpStrDescriptionNL;
            _tmpStrDescriptionNL = _cursor.getString(_cursorIndexOfStrDescriptionNL);
            final String _tmpStrDescriptionNO;
            _tmpStrDescriptionNO = _cursor.getString(_cursorIndexOfStrDescriptionNO);
            final String _tmpStrDescriptionPL;
            _tmpStrDescriptionPL = _cursor.getString(_cursorIndexOfStrDescriptionPL);
            final String _tmpStrDescriptionPT;
            _tmpStrDescriptionPT = _cursor.getString(_cursorIndexOfStrDescriptionPT);
            final String _tmpStrDescriptionRU;
            _tmpStrDescriptionRU = _cursor.getString(_cursorIndexOfStrDescriptionRU);
            final String _tmpStrDescriptionSE;
            _tmpStrDescriptionSE = _cursor.getString(_cursorIndexOfStrDescriptionSE);
            final String _tmpStrFacebook;
            _tmpStrFacebook = _cursor.getString(_cursorIndexOfStrFacebook);
            final String _tmpStrFanart1;
            _tmpStrFanart1 = _cursor.getString(_cursorIndexOfStrFanart1);
            final String _tmpStrFanart2;
            _tmpStrFanart2 = _cursor.getString(_cursorIndexOfStrFanart2);
            final String _tmpStrFanart3;
            _tmpStrFanart3 = _cursor.getString(_cursorIndexOfStrFanart3);
            final String _tmpStrFanart4;
            _tmpStrFanart4 = _cursor.getString(_cursorIndexOfStrFanart4);
            final String _tmpStrGender;
            _tmpStrGender = _cursor.getString(_cursorIndexOfStrGender);
            final String _tmpStrHeight;
            _tmpStrHeight = _cursor.getString(_cursorIndexOfStrHeight);
            final String _tmpStrInstagram;
            _tmpStrInstagram = _cursor.getString(_cursorIndexOfStrInstagram);
            final String _tmpStrLocked;
            _tmpStrLocked = _cursor.getString(_cursorIndexOfStrLocked);
            final String _tmpStrNationality;
            _tmpStrNationality = _cursor.getString(_cursorIndexOfStrNationality);
            final String _tmpStrPlayer;
            _tmpStrPlayer = _cursor.getString(_cursorIndexOfStrPlayer);
            final String _tmpStrPosition;
            _tmpStrPosition = _cursor.getString(_cursorIndexOfStrPosition);
            final String _tmpStrSigning;
            _tmpStrSigning = _cursor.getString(_cursorIndexOfStrSigning);
            final String _tmpStrSport;
            _tmpStrSport = _cursor.getString(_cursorIndexOfStrSport);
            final String _tmpStrTeam;
            _tmpStrTeam = _cursor.getString(_cursorIndexOfStrTeam);
            final String _tmpStrThumb;
            _tmpStrThumb = _cursor.getString(_cursorIndexOfStrThumb);
            final String _tmpStrTwitter;
            _tmpStrTwitter = _cursor.getString(_cursorIndexOfStrTwitter);
            final String _tmpStrWage;
            _tmpStrWage = _cursor.getString(_cursorIndexOfStrWage);
            final String _tmpStrWebsite;
            _tmpStrWebsite = _cursor.getString(_cursorIndexOfStrWebsite);
            final String _tmpStrWeight;
            _tmpStrWeight = _cursor.getString(_cursorIndexOfStrWeight);
            final String _tmpStrYoutube;
            _tmpStrYoutube = _cursor.getString(_cursorIndexOfStrYoutube);
            _result = new Player(_tmpIdPlayer,_tmpIdTeam,_tmpDateBorn,_tmpDateSigned,_tmpIdPlayerManager,_tmpIdSoccerXML,_tmpIntLoved,_tmpIntSoccerXMLTeamID,_tmpStrBanner,_tmpStrBirthLocation,_tmpStrCollege,_tmpStrCutout,_tmpStrDescriptionCN,_tmpStrDescriptionDE,_tmpStrDescriptionEN,_tmpStrDescriptionES,_tmpStrDescriptionFR,_tmpStrDescriptionHU,_tmpStrDescriptionIL,_tmpStrDescriptionIT,_tmpStrDescriptionJP,_tmpStrDescriptionNL,_tmpStrDescriptionNO,_tmpStrDescriptionPL,_tmpStrDescriptionPT,_tmpStrDescriptionRU,_tmpStrDescriptionSE,_tmpStrFacebook,_tmpStrFanart1,_tmpStrFanart2,_tmpStrFanart3,_tmpStrFanart4,_tmpStrGender,_tmpStrHeight,_tmpStrInstagram,_tmpStrLocked,_tmpStrNationality,_tmpStrPlayer,_tmpStrPosition,_tmpStrSigning,_tmpStrSport,_tmpStrTeam,_tmpStrThumb,_tmpStrTwitter,_tmpStrWage,_tmpStrWebsite,_tmpStrWeight,_tmpStrYoutube);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Match>> searchMatch(final String query) {
    final String _sql = "SELECT * FROM matches WHERE strEvent LIKE ? ORDER BY dateEvent DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"matches"}, new Callable<List<Match>>() {
      @Override
      public List<Match> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfMatchType = CursorUtil.getColumnIndexOrThrow(_cursor, "matchType");
          final int _cursorIndexOfIdEvent = CursorUtil.getColumnIndexOrThrow(_cursor, "idEvent");
          final int _cursorIndexOfDateEvent = CursorUtil.getColumnIndexOrThrow(_cursor, "dateEvent");
          final int _cursorIndexOfIdAwayTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "idAwayTeam");
          final int _cursorIndexOfIdHomeTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "idHomeTeam");
          final int _cursorIndexOfIdLeague = CursorUtil.getColumnIndexOrThrow(_cursor, "idLeague");
          final int _cursorIndexOfIdSoccerXML = CursorUtil.getColumnIndexOrThrow(_cursor, "idSoccerXML");
          final int _cursorIndexOfIntAwayScore = CursorUtil.getColumnIndexOrThrow(_cursor, "intAwayScore");
          final int _cursorIndexOfIntAwayShots = CursorUtil.getColumnIndexOrThrow(_cursor, "intAwayShots");
          final int _cursorIndexOfIntHomeScore = CursorUtil.getColumnIndexOrThrow(_cursor, "intHomeScore");
          final int _cursorIndexOfIntHomeShots = CursorUtil.getColumnIndexOrThrow(_cursor, "intHomeShots");
          final int _cursorIndexOfIntRound = CursorUtil.getColumnIndexOrThrow(_cursor, "intRound");
          final int _cursorIndexOfIntSpectators = CursorUtil.getColumnIndexOrThrow(_cursor, "intSpectators");
          final int _cursorIndexOfStrAwayFormation = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayFormation");
          final int _cursorIndexOfStrAwayGoalDetails = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayGoalDetails");
          final int _cursorIndexOfStrAwayLineupDefense = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupDefense");
          final int _cursorIndexOfStrAwayLineupForward = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupForward");
          final int _cursorIndexOfStrAwayLineupGoalkeeper = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupGoalkeeper");
          final int _cursorIndexOfStrAwayLineupMidfield = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupMidfield");
          final int _cursorIndexOfStrAwayLineupSubstitutes = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayLineupSubstitutes");
          final int _cursorIndexOfStrAwayRedCards = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayRedCards");
          final int _cursorIndexOfStrAwayTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayTeam");
          final int _cursorIndexOfStrAwayYellowCards = CursorUtil.getColumnIndexOrThrow(_cursor, "strAwayYellowCards");
          final int _cursorIndexOfStrBanner = CursorUtil.getColumnIndexOrThrow(_cursor, "strBanner");
          final int _cursorIndexOfStrCircuit = CursorUtil.getColumnIndexOrThrow(_cursor, "strCircuit");
          final int _cursorIndexOfStrCity = CursorUtil.getColumnIndexOrThrow(_cursor, "strCity");
          final int _cursorIndexOfStrCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "strCountry");
          final int _cursorIndexOfStrDate = CursorUtil.getColumnIndexOrThrow(_cursor, "strDate");
          final int _cursorIndexOfStrDescriptionEN = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionEN");
          final int _cursorIndexOfStrEvent = CursorUtil.getColumnIndexOrThrow(_cursor, "strEvent");
          final int _cursorIndexOfStrFanart = CursorUtil.getColumnIndexOrThrow(_cursor, "strFanart");
          final int _cursorIndexOfStrFilename = CursorUtil.getColumnIndexOrThrow(_cursor, "strFilename");
          final int _cursorIndexOfStrHomeFormation = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeFormation");
          final int _cursorIndexOfStrHomeGoalDetails = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeGoalDetails");
          final int _cursorIndexOfStrHomeLineupDefense = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupDefense");
          final int _cursorIndexOfStrHomeLineupForward = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupForward");
          final int _cursorIndexOfStrHomeLineupGoalkeeper = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupGoalkeeper");
          final int _cursorIndexOfStrHomeLineupMidfield = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupMidfield");
          final int _cursorIndexOfStrHomeLineupSubstitutes = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeLineupSubstitutes");
          final int _cursorIndexOfStrHomeRedCards = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeRedCards");
          final int _cursorIndexOfStrHomeTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeTeam");
          final int _cursorIndexOfStrHomeYellowCards = CursorUtil.getColumnIndexOrThrow(_cursor, "strHomeYellowCards");
          final int _cursorIndexOfStrLeague = CursorUtil.getColumnIndexOrThrow(_cursor, "strLeague");
          final int _cursorIndexOfStrLocked = CursorUtil.getColumnIndexOrThrow(_cursor, "strLocked");
          final int _cursorIndexOfStrMap = CursorUtil.getColumnIndexOrThrow(_cursor, "strMap");
          final int _cursorIndexOfStrPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "strPoster");
          final int _cursorIndexOfStrResult = CursorUtil.getColumnIndexOrThrow(_cursor, "strResult");
          final int _cursorIndexOfStrSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "strSeason");
          final int _cursorIndexOfStrSport = CursorUtil.getColumnIndexOrThrow(_cursor, "strSport");
          final int _cursorIndexOfStrTVStation = CursorUtil.getColumnIndexOrThrow(_cursor, "strTVStation");
          final int _cursorIndexOfStrThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "strThumb");
          final int _cursorIndexOfStrTime = CursorUtil.getColumnIndexOrThrow(_cursor, "strTime");
          final List<Match> _result = new ArrayList<Match>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Match _item;
            final String _tmpIdEvent;
            _tmpIdEvent = _cursor.getString(_cursorIndexOfIdEvent);
            final String _tmpDateEvent;
            _tmpDateEvent = _cursor.getString(_cursorIndexOfDateEvent);
            final String _tmpIdAwayTeam;
            _tmpIdAwayTeam = _cursor.getString(_cursorIndexOfIdAwayTeam);
            final String _tmpIdHomeTeam;
            _tmpIdHomeTeam = _cursor.getString(_cursorIndexOfIdHomeTeam);
            final String _tmpIdLeague;
            _tmpIdLeague = _cursor.getString(_cursorIndexOfIdLeague);
            final String _tmpIdSoccerXML;
            _tmpIdSoccerXML = _cursor.getString(_cursorIndexOfIdSoccerXML);
            final String _tmpIntAwayScore;
            _tmpIntAwayScore = _cursor.getString(_cursorIndexOfIntAwayScore);
            final String _tmpIntAwayShots;
            _tmpIntAwayShots = _cursor.getString(_cursorIndexOfIntAwayShots);
            final String _tmpIntHomeScore;
            _tmpIntHomeScore = _cursor.getString(_cursorIndexOfIntHomeScore);
            final String _tmpIntHomeShots;
            _tmpIntHomeShots = _cursor.getString(_cursorIndexOfIntHomeShots);
            final String _tmpIntRound;
            _tmpIntRound = _cursor.getString(_cursorIndexOfIntRound);
            final String _tmpIntSpectators;
            _tmpIntSpectators = _cursor.getString(_cursorIndexOfIntSpectators);
            final String _tmpStrAwayFormation;
            _tmpStrAwayFormation = _cursor.getString(_cursorIndexOfStrAwayFormation);
            final String _tmpStrAwayGoalDetails;
            _tmpStrAwayGoalDetails = _cursor.getString(_cursorIndexOfStrAwayGoalDetails);
            final String _tmpStrAwayLineupDefense;
            _tmpStrAwayLineupDefense = _cursor.getString(_cursorIndexOfStrAwayLineupDefense);
            final String _tmpStrAwayLineupForward;
            _tmpStrAwayLineupForward = _cursor.getString(_cursorIndexOfStrAwayLineupForward);
            final String _tmpStrAwayLineupGoalkeeper;
            _tmpStrAwayLineupGoalkeeper = _cursor.getString(_cursorIndexOfStrAwayLineupGoalkeeper);
            final String _tmpStrAwayLineupMidfield;
            _tmpStrAwayLineupMidfield = _cursor.getString(_cursorIndexOfStrAwayLineupMidfield);
            final String _tmpStrAwayLineupSubstitutes;
            _tmpStrAwayLineupSubstitutes = _cursor.getString(_cursorIndexOfStrAwayLineupSubstitutes);
            final String _tmpStrAwayRedCards;
            _tmpStrAwayRedCards = _cursor.getString(_cursorIndexOfStrAwayRedCards);
            final String _tmpStrAwayTeam;
            _tmpStrAwayTeam = _cursor.getString(_cursorIndexOfStrAwayTeam);
            final String _tmpStrAwayYellowCards;
            _tmpStrAwayYellowCards = _cursor.getString(_cursorIndexOfStrAwayYellowCards);
            final String _tmpStrBanner;
            _tmpStrBanner = _cursor.getString(_cursorIndexOfStrBanner);
            final String _tmpStrCircuit;
            _tmpStrCircuit = _cursor.getString(_cursorIndexOfStrCircuit);
            final String _tmpStrCity;
            _tmpStrCity = _cursor.getString(_cursorIndexOfStrCity);
            final String _tmpStrCountry;
            _tmpStrCountry = _cursor.getString(_cursorIndexOfStrCountry);
            final String _tmpStrDate;
            _tmpStrDate = _cursor.getString(_cursorIndexOfStrDate);
            final String _tmpStrDescriptionEN;
            _tmpStrDescriptionEN = _cursor.getString(_cursorIndexOfStrDescriptionEN);
            final String _tmpStrEvent;
            _tmpStrEvent = _cursor.getString(_cursorIndexOfStrEvent);
            final String _tmpStrFanart;
            _tmpStrFanart = _cursor.getString(_cursorIndexOfStrFanart);
            final String _tmpStrFilename;
            _tmpStrFilename = _cursor.getString(_cursorIndexOfStrFilename);
            final String _tmpStrHomeFormation;
            _tmpStrHomeFormation = _cursor.getString(_cursorIndexOfStrHomeFormation);
            final String _tmpStrHomeGoalDetails;
            _tmpStrHomeGoalDetails = _cursor.getString(_cursorIndexOfStrHomeGoalDetails);
            final String _tmpStrHomeLineupDefense;
            _tmpStrHomeLineupDefense = _cursor.getString(_cursorIndexOfStrHomeLineupDefense);
            final String _tmpStrHomeLineupForward;
            _tmpStrHomeLineupForward = _cursor.getString(_cursorIndexOfStrHomeLineupForward);
            final String _tmpStrHomeLineupGoalkeeper;
            _tmpStrHomeLineupGoalkeeper = _cursor.getString(_cursorIndexOfStrHomeLineupGoalkeeper);
            final String _tmpStrHomeLineupMidfield;
            _tmpStrHomeLineupMidfield = _cursor.getString(_cursorIndexOfStrHomeLineupMidfield);
            final String _tmpStrHomeLineupSubstitutes;
            _tmpStrHomeLineupSubstitutes = _cursor.getString(_cursorIndexOfStrHomeLineupSubstitutes);
            final String _tmpStrHomeRedCards;
            _tmpStrHomeRedCards = _cursor.getString(_cursorIndexOfStrHomeRedCards);
            final String _tmpStrHomeTeam;
            _tmpStrHomeTeam = _cursor.getString(_cursorIndexOfStrHomeTeam);
            final String _tmpStrHomeYellowCards;
            _tmpStrHomeYellowCards = _cursor.getString(_cursorIndexOfStrHomeYellowCards);
            final String _tmpStrLeague;
            _tmpStrLeague = _cursor.getString(_cursorIndexOfStrLeague);
            final String _tmpStrLocked;
            _tmpStrLocked = _cursor.getString(_cursorIndexOfStrLocked);
            final String _tmpStrMap;
            _tmpStrMap = _cursor.getString(_cursorIndexOfStrMap);
            final String _tmpStrPoster;
            _tmpStrPoster = _cursor.getString(_cursorIndexOfStrPoster);
            final String _tmpStrResult;
            _tmpStrResult = _cursor.getString(_cursorIndexOfStrResult);
            final String _tmpStrSeason;
            _tmpStrSeason = _cursor.getString(_cursorIndexOfStrSeason);
            final String _tmpStrSport;
            _tmpStrSport = _cursor.getString(_cursorIndexOfStrSport);
            final String _tmpStrTVStation;
            _tmpStrTVStation = _cursor.getString(_cursorIndexOfStrTVStation);
            final String _tmpStrThumb;
            _tmpStrThumb = _cursor.getString(_cursorIndexOfStrThumb);
            final String _tmpStrTime;
            _tmpStrTime = _cursor.getString(_cursorIndexOfStrTime);
            _item = new Match(_tmpIdEvent,_tmpDateEvent,_tmpIdAwayTeam,_tmpIdHomeTeam,_tmpIdLeague,_tmpIdSoccerXML,_tmpIntAwayScore,_tmpIntAwayShots,_tmpIntHomeScore,_tmpIntHomeShots,_tmpIntRound,_tmpIntSpectators,_tmpStrAwayFormation,_tmpStrAwayGoalDetails,_tmpStrAwayLineupDefense,_tmpStrAwayLineupForward,_tmpStrAwayLineupGoalkeeper,_tmpStrAwayLineupMidfield,_tmpStrAwayLineupSubstitutes,_tmpStrAwayRedCards,_tmpStrAwayTeam,_tmpStrAwayYellowCards,_tmpStrBanner,_tmpStrCircuit,_tmpStrCity,_tmpStrCountry,_tmpStrDate,_tmpStrDescriptionEN,_tmpStrEvent,_tmpStrFanart,_tmpStrFilename,_tmpStrHomeFormation,_tmpStrHomeGoalDetails,_tmpStrHomeLineupDefense,_tmpStrHomeLineupForward,_tmpStrHomeLineupGoalkeeper,_tmpStrHomeLineupMidfield,_tmpStrHomeLineupSubstitutes,_tmpStrHomeRedCards,_tmpStrHomeTeam,_tmpStrHomeYellowCards,_tmpStrLeague,_tmpStrLocked,_tmpStrMap,_tmpStrPoster,_tmpStrResult,_tmpStrSeason,_tmpStrSport,_tmpStrTVStation,_tmpStrThumb,_tmpStrTime);
            final String _tmpMatchType;
            _tmpMatchType = _cursor.getString(_cursorIndexOfMatchType);
            _item.setMatchType(_tmpMatchType);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Team>> searchTeam(final String query) {
    final String _sql = "SELECT * FROM teams WHERE strTeam LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"teams"}, new Callable<List<Team>>() {
      @Override
      public List<Team> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfIdLeague = CursorUtil.getColumnIndexOrThrow(_cursor, "idLeague");
          final int _cursorIndexOfIdTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "idTeam");
          final int _cursorIndexOfIdSoccerXML = CursorUtil.getColumnIndexOrThrow(_cursor, "idSoccerXML");
          final int _cursorIndexOfIntFormedYear = CursorUtil.getColumnIndexOrThrow(_cursor, "intFormedYear");
          final int _cursorIndexOfIntLoved = CursorUtil.getColumnIndexOrThrow(_cursor, "intLoved");
          final int _cursorIndexOfIntStadiumCapacity = CursorUtil.getColumnIndexOrThrow(_cursor, "intStadiumCapacity");
          final int _cursorIndexOfStrAlternate = CursorUtil.getColumnIndexOrThrow(_cursor, "strAlternate");
          final int _cursorIndexOfStrCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "strCountry");
          final int _cursorIndexOfStrDescriptionCN = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionCN");
          final int _cursorIndexOfStrDescriptionDE = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionDE");
          final int _cursorIndexOfStrDescriptionEN = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionEN");
          final int _cursorIndexOfStrDescriptionES = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionES");
          final int _cursorIndexOfStrDescriptionFR = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionFR");
          final int _cursorIndexOfStrDescriptionHU = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionHU");
          final int _cursorIndexOfStrDescriptionIL = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionIL");
          final int _cursorIndexOfStrDescriptionIT = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionIT");
          final int _cursorIndexOfStrDescriptionJP = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionJP");
          final int _cursorIndexOfStrDescriptionNL = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionNL");
          final int _cursorIndexOfStrDescriptionNO = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionNO");
          final int _cursorIndexOfStrDescriptionPL = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionPL");
          final int _cursorIndexOfStrDescriptionPT = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionPT");
          final int _cursorIndexOfStrDescriptionRU = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionRU");
          final int _cursorIndexOfStrDescriptionSE = CursorUtil.getColumnIndexOrThrow(_cursor, "strDescriptionSE");
          final int _cursorIndexOfStrDivision = CursorUtil.getColumnIndexOrThrow(_cursor, "strDivision");
          final int _cursorIndexOfStrFacebook = CursorUtil.getColumnIndexOrThrow(_cursor, "strFacebook");
          final int _cursorIndexOfStrGender = CursorUtil.getColumnIndexOrThrow(_cursor, "strGender");
          final int _cursorIndexOfStrInstagram = CursorUtil.getColumnIndexOrThrow(_cursor, "strInstagram");
          final int _cursorIndexOfStrKeywords = CursorUtil.getColumnIndexOrThrow(_cursor, "strKeywords");
          final int _cursorIndexOfStrLeague = CursorUtil.getColumnIndexOrThrow(_cursor, "strLeague");
          final int _cursorIndexOfStrLocked = CursorUtil.getColumnIndexOrThrow(_cursor, "strLocked");
          final int _cursorIndexOfStrManager = CursorUtil.getColumnIndexOrThrow(_cursor, "strManager");
          final int _cursorIndexOfStrRSS = CursorUtil.getColumnIndexOrThrow(_cursor, "strRSS");
          final int _cursorIndexOfStrSport = CursorUtil.getColumnIndexOrThrow(_cursor, "strSport");
          final int _cursorIndexOfStrStadium = CursorUtil.getColumnIndexOrThrow(_cursor, "strStadium");
          final int _cursorIndexOfStrStadiumDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "strStadiumDescription");
          final int _cursorIndexOfStrStadiumLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "strStadiumLocation");
          final int _cursorIndexOfStrStadiumThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "strStadiumThumb");
          final int _cursorIndexOfStrTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeam");
          final int _cursorIndexOfStrTeamBadge = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamBadge");
          final int _cursorIndexOfStrTeamBanner = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamBanner");
          final int _cursorIndexOfStrTeamFanart1 = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamFanart1");
          final int _cursorIndexOfStrTeamFanart2 = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamFanart2");
          final int _cursorIndexOfStrTeamFanart3 = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamFanart3");
          final int _cursorIndexOfStrTeamFanart4 = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamFanart4");
          final int _cursorIndexOfStrTeamJersey = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamJersey");
          final int _cursorIndexOfStrTeamLogo = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamLogo");
          final int _cursorIndexOfStrTeamShort = CursorUtil.getColumnIndexOrThrow(_cursor, "strTeamShort");
          final int _cursorIndexOfStrTwitter = CursorUtil.getColumnIndexOrThrow(_cursor, "strTwitter");
          final int _cursorIndexOfStrWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "strWebsite");
          final int _cursorIndexOfStrYoutube = CursorUtil.getColumnIndexOrThrow(_cursor, "strYoutube");
          final List<Team> _result = new ArrayList<Team>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Team _item;
            final String _tmpIdLeague;
            _tmpIdLeague = _cursor.getString(_cursorIndexOfIdLeague);
            final String _tmpIdTeam;
            _tmpIdTeam = _cursor.getString(_cursorIndexOfIdTeam);
            final String _tmpIdSoccerXML;
            _tmpIdSoccerXML = _cursor.getString(_cursorIndexOfIdSoccerXML);
            final String _tmpIntFormedYear;
            _tmpIntFormedYear = _cursor.getString(_cursorIndexOfIntFormedYear);
            final String _tmpIntLoved;
            _tmpIntLoved = _cursor.getString(_cursorIndexOfIntLoved);
            final String _tmpIntStadiumCapacity;
            _tmpIntStadiumCapacity = _cursor.getString(_cursorIndexOfIntStadiumCapacity);
            final String _tmpStrAlternate;
            _tmpStrAlternate = _cursor.getString(_cursorIndexOfStrAlternate);
            final String _tmpStrCountry;
            _tmpStrCountry = _cursor.getString(_cursorIndexOfStrCountry);
            final String _tmpStrDescriptionCN;
            _tmpStrDescriptionCN = _cursor.getString(_cursorIndexOfStrDescriptionCN);
            final String _tmpStrDescriptionDE;
            _tmpStrDescriptionDE = _cursor.getString(_cursorIndexOfStrDescriptionDE);
            final String _tmpStrDescriptionEN;
            _tmpStrDescriptionEN = _cursor.getString(_cursorIndexOfStrDescriptionEN);
            final String _tmpStrDescriptionES;
            _tmpStrDescriptionES = _cursor.getString(_cursorIndexOfStrDescriptionES);
            final String _tmpStrDescriptionFR;
            _tmpStrDescriptionFR = _cursor.getString(_cursorIndexOfStrDescriptionFR);
            final String _tmpStrDescriptionHU;
            _tmpStrDescriptionHU = _cursor.getString(_cursorIndexOfStrDescriptionHU);
            final String _tmpStrDescriptionIL;
            _tmpStrDescriptionIL = _cursor.getString(_cursorIndexOfStrDescriptionIL);
            final String _tmpStrDescriptionIT;
            _tmpStrDescriptionIT = _cursor.getString(_cursorIndexOfStrDescriptionIT);
            final String _tmpStrDescriptionJP;
            _tmpStrDescriptionJP = _cursor.getString(_cursorIndexOfStrDescriptionJP);
            final String _tmpStrDescriptionNL;
            _tmpStrDescriptionNL = _cursor.getString(_cursorIndexOfStrDescriptionNL);
            final String _tmpStrDescriptionNO;
            _tmpStrDescriptionNO = _cursor.getString(_cursorIndexOfStrDescriptionNO);
            final String _tmpStrDescriptionPL;
            _tmpStrDescriptionPL = _cursor.getString(_cursorIndexOfStrDescriptionPL);
            final String _tmpStrDescriptionPT;
            _tmpStrDescriptionPT = _cursor.getString(_cursorIndexOfStrDescriptionPT);
            final String _tmpStrDescriptionRU;
            _tmpStrDescriptionRU = _cursor.getString(_cursorIndexOfStrDescriptionRU);
            final String _tmpStrDescriptionSE;
            _tmpStrDescriptionSE = _cursor.getString(_cursorIndexOfStrDescriptionSE);
            final String _tmpStrDivision;
            _tmpStrDivision = _cursor.getString(_cursorIndexOfStrDivision);
            final String _tmpStrFacebook;
            _tmpStrFacebook = _cursor.getString(_cursorIndexOfStrFacebook);
            final String _tmpStrGender;
            _tmpStrGender = _cursor.getString(_cursorIndexOfStrGender);
            final String _tmpStrInstagram;
            _tmpStrInstagram = _cursor.getString(_cursorIndexOfStrInstagram);
            final String _tmpStrKeywords;
            _tmpStrKeywords = _cursor.getString(_cursorIndexOfStrKeywords);
            final String _tmpStrLeague;
            _tmpStrLeague = _cursor.getString(_cursorIndexOfStrLeague);
            final String _tmpStrLocked;
            _tmpStrLocked = _cursor.getString(_cursorIndexOfStrLocked);
            final String _tmpStrManager;
            _tmpStrManager = _cursor.getString(_cursorIndexOfStrManager);
            final String _tmpStrRSS;
            _tmpStrRSS = _cursor.getString(_cursorIndexOfStrRSS);
            final String _tmpStrSport;
            _tmpStrSport = _cursor.getString(_cursorIndexOfStrSport);
            final String _tmpStrStadium;
            _tmpStrStadium = _cursor.getString(_cursorIndexOfStrStadium);
            final String _tmpStrStadiumDescription;
            _tmpStrStadiumDescription = _cursor.getString(_cursorIndexOfStrStadiumDescription);
            final String _tmpStrStadiumLocation;
            _tmpStrStadiumLocation = _cursor.getString(_cursorIndexOfStrStadiumLocation);
            final String _tmpStrStadiumThumb;
            _tmpStrStadiumThumb = _cursor.getString(_cursorIndexOfStrStadiumThumb);
            final String _tmpStrTeam;
            _tmpStrTeam = _cursor.getString(_cursorIndexOfStrTeam);
            final String _tmpStrTeamBadge;
            _tmpStrTeamBadge = _cursor.getString(_cursorIndexOfStrTeamBadge);
            final String _tmpStrTeamBanner;
            _tmpStrTeamBanner = _cursor.getString(_cursorIndexOfStrTeamBanner);
            final String _tmpStrTeamFanart1;
            _tmpStrTeamFanart1 = _cursor.getString(_cursorIndexOfStrTeamFanart1);
            final String _tmpStrTeamFanart2;
            _tmpStrTeamFanart2 = _cursor.getString(_cursorIndexOfStrTeamFanart2);
            final String _tmpStrTeamFanart3;
            _tmpStrTeamFanart3 = _cursor.getString(_cursorIndexOfStrTeamFanart3);
            final String _tmpStrTeamFanart4;
            _tmpStrTeamFanart4 = _cursor.getString(_cursorIndexOfStrTeamFanart4);
            final String _tmpStrTeamJersey;
            _tmpStrTeamJersey = _cursor.getString(_cursorIndexOfStrTeamJersey);
            final String _tmpStrTeamLogo;
            _tmpStrTeamLogo = _cursor.getString(_cursorIndexOfStrTeamLogo);
            final String _tmpStrTeamShort;
            _tmpStrTeamShort = _cursor.getString(_cursorIndexOfStrTeamShort);
            final String _tmpStrTwitter;
            _tmpStrTwitter = _cursor.getString(_cursorIndexOfStrTwitter);
            final String _tmpStrWebsite;
            _tmpStrWebsite = _cursor.getString(_cursorIndexOfStrWebsite);
            final String _tmpStrYoutube;
            _tmpStrYoutube = _cursor.getString(_cursorIndexOfStrYoutube);
            _item = new Team(_tmpIdLeague,_tmpIdTeam,_tmpIdSoccerXML,_tmpIntFormedYear,_tmpIntLoved,_tmpIntStadiumCapacity,_tmpStrAlternate,_tmpStrCountry,_tmpStrDescriptionCN,_tmpStrDescriptionDE,_tmpStrDescriptionEN,_tmpStrDescriptionES,_tmpStrDescriptionFR,_tmpStrDescriptionHU,_tmpStrDescriptionIL,_tmpStrDescriptionIT,_tmpStrDescriptionJP,_tmpStrDescriptionNL,_tmpStrDescriptionNO,_tmpStrDescriptionPL,_tmpStrDescriptionPT,_tmpStrDescriptionRU,_tmpStrDescriptionSE,_tmpStrDivision,_tmpStrFacebook,_tmpStrGender,_tmpStrInstagram,_tmpStrKeywords,_tmpStrLeague,_tmpStrLocked,_tmpStrManager,_tmpStrRSS,_tmpStrSport,_tmpStrStadium,_tmpStrStadiumDescription,_tmpStrStadiumLocation,_tmpStrStadiumThumb,_tmpStrTeam,_tmpStrTeamBadge,_tmpStrTeamBanner,_tmpStrTeamFanart1,_tmpStrTeamFanart2,_tmpStrTeamFanart3,_tmpStrTeamFanart4,_tmpStrTeamJersey,_tmpStrTeamLogo,_tmpStrTeamShort,_tmpStrTwitter,_tmpStrWebsite,_tmpStrYoutube);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
