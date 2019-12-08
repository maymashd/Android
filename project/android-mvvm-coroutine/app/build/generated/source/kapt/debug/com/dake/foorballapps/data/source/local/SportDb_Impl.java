package com.dake.foorballapps.data.source.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class SportDb_Impl extends SportDb {
  private volatile SportDao _sportDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `matches` (`matchType` TEXT, `idEvent` TEXT NOT NULL, `dateEvent` TEXT, `idAwayTeam` TEXT, `idHomeTeam` TEXT, `idLeague` TEXT, `idSoccerXML` TEXT, `intAwayScore` TEXT, `intAwayShots` TEXT, `intHomeScore` TEXT, `intHomeShots` TEXT, `intRound` TEXT, `intSpectators` TEXT, `strAwayFormation` TEXT, `strAwayGoalDetails` TEXT, `strAwayLineupDefense` TEXT, `strAwayLineupForward` TEXT, `strAwayLineupGoalkeeper` TEXT, `strAwayLineupMidfield` TEXT, `strAwayLineupSubstitutes` TEXT, `strAwayRedCards` TEXT, `strAwayTeam` TEXT, `strAwayYellowCards` TEXT, `strBanner` TEXT, `strCircuit` TEXT, `strCity` TEXT, `strCountry` TEXT, `strDate` TEXT, `strDescriptionEN` TEXT, `strEvent` TEXT, `strFanart` TEXT, `strFilename` TEXT, `strHomeFormation` TEXT, `strHomeGoalDetails` TEXT, `strHomeLineupDefense` TEXT, `strHomeLineupForward` TEXT, `strHomeLineupGoalkeeper` TEXT, `strHomeLineupMidfield` TEXT, `strHomeLineupSubstitutes` TEXT, `strHomeRedCards` TEXT, `strHomeTeam` TEXT, `strHomeYellowCards` TEXT, `strLeague` TEXT, `strLocked` TEXT, `strMap` TEXT, `strPoster` TEXT, `strResult` TEXT, `strSeason` TEXT, `strSport` TEXT, `strTVStation` TEXT, `strThumb` TEXT, `strTime` TEXT, PRIMARY KEY(`idEvent`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `teams` (`idLeague` TEXT NOT NULL, `idTeam` TEXT NOT NULL, `idSoccerXML` TEXT, `intFormedYear` TEXT, `intLoved` TEXT, `intStadiumCapacity` TEXT, `strAlternate` TEXT, `strCountry` TEXT, `strDescriptionCN` TEXT, `strDescriptionDE` TEXT, `strDescriptionEN` TEXT, `strDescriptionES` TEXT, `strDescriptionFR` TEXT, `strDescriptionHU` TEXT, `strDescriptionIL` TEXT, `strDescriptionIT` TEXT, `strDescriptionJP` TEXT, `strDescriptionNL` TEXT, `strDescriptionNO` TEXT, `strDescriptionPL` TEXT, `strDescriptionPT` TEXT, `strDescriptionRU` TEXT, `strDescriptionSE` TEXT, `strDivision` TEXT, `strFacebook` TEXT, `strGender` TEXT, `strInstagram` TEXT, `strKeywords` TEXT, `strLeague` TEXT, `strLocked` TEXT, `strManager` TEXT, `strRSS` TEXT, `strSport` TEXT, `strStadium` TEXT, `strStadiumDescription` TEXT, `strStadiumLocation` TEXT, `strStadiumThumb` TEXT, `strTeam` TEXT, `strTeamBadge` TEXT, `strTeamBanner` TEXT, `strTeamFanart1` TEXT, `strTeamFanart2` TEXT, `strTeamFanart3` TEXT, `strTeamFanart4` TEXT, `strTeamJersey` TEXT, `strTeamLogo` TEXT, `strTeamShort` TEXT, `strTwitter` TEXT, `strWebsite` TEXT, `strYoutube` TEXT, PRIMARY KEY(`idLeague`, `idTeam`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `players` (`idPlayer` TEXT NOT NULL, `idTeam` TEXT NOT NULL, `dateBorn` TEXT, `dateSigned` TEXT, `idPlayerManager` TEXT, `idSoccerXML` TEXT, `intLoved` TEXT, `intSoccerXMLTeamID` TEXT, `strBanner` TEXT, `strBirthLocation` TEXT, `strCollege` TEXT, `strCutout` TEXT, `strDescriptionCN` TEXT, `strDescriptionDE` TEXT, `strDescriptionEN` TEXT, `strDescriptionES` TEXT, `strDescriptionFR` TEXT, `strDescriptionHU` TEXT, `strDescriptionIL` TEXT, `strDescriptionIT` TEXT, `strDescriptionJP` TEXT, `strDescriptionNL` TEXT, `strDescriptionNO` TEXT, `strDescriptionPL` TEXT, `strDescriptionPT` TEXT, `strDescriptionRU` TEXT, `strDescriptionSE` TEXT, `strFacebook` TEXT, `strFanart1` TEXT, `strFanart2` TEXT, `strFanart3` TEXT, `strFanart4` TEXT, `strGender` TEXT, `strHeight` TEXT, `strInstagram` TEXT, `strLocked` TEXT, `strNationality` TEXT, `strPlayer` TEXT, `strPosition` TEXT, `strSigning` TEXT, `strSport` TEXT, `strTeam` TEXT, `strThumb` TEXT, `strTwitter` TEXT, `strWage` TEXT, `strWebsite` TEXT, `strWeight` TEXT, `strYoutube` TEXT, PRIMARY KEY(`idPlayer`, `idTeam`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `favorite_matches` (`idMatch` TEXT NOT NULL, PRIMARY KEY(`idMatch`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `favorite_teams` (`idTeam` TEXT NOT NULL, PRIMARY KEY(`idTeam`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"c938fae2c84816465a48dfb1a6750dca\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `matches`");
        _db.execSQL("DROP TABLE IF EXISTS `teams`");
        _db.execSQL("DROP TABLE IF EXISTS `players`");
        _db.execSQL("DROP TABLE IF EXISTS `favorite_matches`");
        _db.execSQL("DROP TABLE IF EXISTS `favorite_teams`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMatches = new HashMap<String, TableInfo.Column>(52);
        _columnsMatches.put("matchType", new TableInfo.Column("matchType", "TEXT", false, 0));
        _columnsMatches.put("idEvent", new TableInfo.Column("idEvent", "TEXT", true, 1));
        _columnsMatches.put("dateEvent", new TableInfo.Column("dateEvent", "TEXT", false, 0));
        _columnsMatches.put("idAwayTeam", new TableInfo.Column("idAwayTeam", "TEXT", false, 0));
        _columnsMatches.put("idHomeTeam", new TableInfo.Column("idHomeTeam", "TEXT", false, 0));
        _columnsMatches.put("idLeague", new TableInfo.Column("idLeague", "TEXT", false, 0));
        _columnsMatches.put("idSoccerXML", new TableInfo.Column("idSoccerXML", "TEXT", false, 0));
        _columnsMatches.put("intAwayScore", new TableInfo.Column("intAwayScore", "TEXT", false, 0));
        _columnsMatches.put("intAwayShots", new TableInfo.Column("intAwayShots", "TEXT", false, 0));
        _columnsMatches.put("intHomeScore", new TableInfo.Column("intHomeScore", "TEXT", false, 0));
        _columnsMatches.put("intHomeShots", new TableInfo.Column("intHomeShots", "TEXT", false, 0));
        _columnsMatches.put("intRound", new TableInfo.Column("intRound", "TEXT", false, 0));
        _columnsMatches.put("intSpectators", new TableInfo.Column("intSpectators", "TEXT", false, 0));
        _columnsMatches.put("strAwayFormation", new TableInfo.Column("strAwayFormation", "TEXT", false, 0));
        _columnsMatches.put("strAwayGoalDetails", new TableInfo.Column("strAwayGoalDetails", "TEXT", false, 0));
        _columnsMatches.put("strAwayLineupDefense", new TableInfo.Column("strAwayLineupDefense", "TEXT", false, 0));
        _columnsMatches.put("strAwayLineupForward", new TableInfo.Column("strAwayLineupForward", "TEXT", false, 0));
        _columnsMatches.put("strAwayLineupGoalkeeper", new TableInfo.Column("strAwayLineupGoalkeeper", "TEXT", false, 0));
        _columnsMatches.put("strAwayLineupMidfield", new TableInfo.Column("strAwayLineupMidfield", "TEXT", false, 0));
        _columnsMatches.put("strAwayLineupSubstitutes", new TableInfo.Column("strAwayLineupSubstitutes", "TEXT", false, 0));
        _columnsMatches.put("strAwayRedCards", new TableInfo.Column("strAwayRedCards", "TEXT", false, 0));
        _columnsMatches.put("strAwayTeam", new TableInfo.Column("strAwayTeam", "TEXT", false, 0));
        _columnsMatches.put("strAwayYellowCards", new TableInfo.Column("strAwayYellowCards", "TEXT", false, 0));
        _columnsMatches.put("strBanner", new TableInfo.Column("strBanner", "TEXT", false, 0));
        _columnsMatches.put("strCircuit", new TableInfo.Column("strCircuit", "TEXT", false, 0));
        _columnsMatches.put("strCity", new TableInfo.Column("strCity", "TEXT", false, 0));
        _columnsMatches.put("strCountry", new TableInfo.Column("strCountry", "TEXT", false, 0));
        _columnsMatches.put("strDate", new TableInfo.Column("strDate", "TEXT", false, 0));
        _columnsMatches.put("strDescriptionEN", new TableInfo.Column("strDescriptionEN", "TEXT", false, 0));
        _columnsMatches.put("strEvent", new TableInfo.Column("strEvent", "TEXT", false, 0));
        _columnsMatches.put("strFanart", new TableInfo.Column("strFanart", "TEXT", false, 0));
        _columnsMatches.put("strFilename", new TableInfo.Column("strFilename", "TEXT", false, 0));
        _columnsMatches.put("strHomeFormation", new TableInfo.Column("strHomeFormation", "TEXT", false, 0));
        _columnsMatches.put("strHomeGoalDetails", new TableInfo.Column("strHomeGoalDetails", "TEXT", false, 0));
        _columnsMatches.put("strHomeLineupDefense", new TableInfo.Column("strHomeLineupDefense", "TEXT", false, 0));
        _columnsMatches.put("strHomeLineupForward", new TableInfo.Column("strHomeLineupForward", "TEXT", false, 0));
        _columnsMatches.put("strHomeLineupGoalkeeper", new TableInfo.Column("strHomeLineupGoalkeeper", "TEXT", false, 0));
        _columnsMatches.put("strHomeLineupMidfield", new TableInfo.Column("strHomeLineupMidfield", "TEXT", false, 0));
        _columnsMatches.put("strHomeLineupSubstitutes", new TableInfo.Column("strHomeLineupSubstitutes", "TEXT", false, 0));
        _columnsMatches.put("strHomeRedCards", new TableInfo.Column("strHomeRedCards", "TEXT", false, 0));
        _columnsMatches.put("strHomeTeam", new TableInfo.Column("strHomeTeam", "TEXT", false, 0));
        _columnsMatches.put("strHomeYellowCards", new TableInfo.Column("strHomeYellowCards", "TEXT", false, 0));
        _columnsMatches.put("strLeague", new TableInfo.Column("strLeague", "TEXT", false, 0));
        _columnsMatches.put("strLocked", new TableInfo.Column("strLocked", "TEXT", false, 0));
        _columnsMatches.put("strMap", new TableInfo.Column("strMap", "TEXT", false, 0));
        _columnsMatches.put("strPoster", new TableInfo.Column("strPoster", "TEXT", false, 0));
        _columnsMatches.put("strResult", new TableInfo.Column("strResult", "TEXT", false, 0));
        _columnsMatches.put("strSeason", new TableInfo.Column("strSeason", "TEXT", false, 0));
        _columnsMatches.put("strSport", new TableInfo.Column("strSport", "TEXT", false, 0));
        _columnsMatches.put("strTVStation", new TableInfo.Column("strTVStation", "TEXT", false, 0));
        _columnsMatches.put("strThumb", new TableInfo.Column("strThumb", "TEXT", false, 0));
        _columnsMatches.put("strTime", new TableInfo.Column("strTime", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMatches = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMatches = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMatches = new TableInfo("matches", _columnsMatches, _foreignKeysMatches, _indicesMatches);
        final TableInfo _existingMatches = TableInfo.read(_db, "matches");
        if (! _infoMatches.equals(_existingMatches)) {
          throw new IllegalStateException("Migration didn't properly handle matches(com.dake.foorballapps.vo.Match).\n"
                  + " Expected:\n" + _infoMatches + "\n"
                  + " Found:\n" + _existingMatches);
        }
        final HashMap<String, TableInfo.Column> _columnsTeams = new HashMap<String, TableInfo.Column>(50);
        _columnsTeams.put("idLeague", new TableInfo.Column("idLeague", "TEXT", true, 1));
        _columnsTeams.put("idTeam", new TableInfo.Column("idTeam", "TEXT", true, 2));
        _columnsTeams.put("idSoccerXML", new TableInfo.Column("idSoccerXML", "TEXT", false, 0));
        _columnsTeams.put("intFormedYear", new TableInfo.Column("intFormedYear", "TEXT", false, 0));
        _columnsTeams.put("intLoved", new TableInfo.Column("intLoved", "TEXT", false, 0));
        _columnsTeams.put("intStadiumCapacity", new TableInfo.Column("intStadiumCapacity", "TEXT", false, 0));
        _columnsTeams.put("strAlternate", new TableInfo.Column("strAlternate", "TEXT", false, 0));
        _columnsTeams.put("strCountry", new TableInfo.Column("strCountry", "TEXT", false, 0));
        _columnsTeams.put("strDescriptionCN", new TableInfo.Column("strDescriptionCN", "TEXT", false, 0));
        _columnsTeams.put("strDescriptionDE", new TableInfo.Column("strDescriptionDE", "TEXT", false, 0));
        _columnsTeams.put("strDescriptionEN", new TableInfo.Column("strDescriptionEN", "TEXT", false, 0));
        _columnsTeams.put("strDescriptionES", new TableInfo.Column("strDescriptionES", "TEXT", false, 0));
        _columnsTeams.put("strDescriptionFR", new TableInfo.Column("strDescriptionFR", "TEXT", false, 0));
        _columnsTeams.put("strDescriptionHU", new TableInfo.Column("strDescriptionHU", "TEXT", false, 0));
        _columnsTeams.put("strDescriptionIL", new TableInfo.Column("strDescriptionIL", "TEXT", false, 0));
        _columnsTeams.put("strDescriptionIT", new TableInfo.Column("strDescriptionIT", "TEXT", false, 0));
        _columnsTeams.put("strDescriptionJP", new TableInfo.Column("strDescriptionJP", "TEXT", false, 0));
        _columnsTeams.put("strDescriptionNL", new TableInfo.Column("strDescriptionNL", "TEXT", false, 0));
        _columnsTeams.put("strDescriptionNO", new TableInfo.Column("strDescriptionNO", "TEXT", false, 0));
        _columnsTeams.put("strDescriptionPL", new TableInfo.Column("strDescriptionPL", "TEXT", false, 0));
        _columnsTeams.put("strDescriptionPT", new TableInfo.Column("strDescriptionPT", "TEXT", false, 0));
        _columnsTeams.put("strDescriptionRU", new TableInfo.Column("strDescriptionRU", "TEXT", false, 0));
        _columnsTeams.put("strDescriptionSE", new TableInfo.Column("strDescriptionSE", "TEXT", false, 0));
        _columnsTeams.put("strDivision", new TableInfo.Column("strDivision", "TEXT", false, 0));
        _columnsTeams.put("strFacebook", new TableInfo.Column("strFacebook", "TEXT", false, 0));
        _columnsTeams.put("strGender", new TableInfo.Column("strGender", "TEXT", false, 0));
        _columnsTeams.put("strInstagram", new TableInfo.Column("strInstagram", "TEXT", false, 0));
        _columnsTeams.put("strKeywords", new TableInfo.Column("strKeywords", "TEXT", false, 0));
        _columnsTeams.put("strLeague", new TableInfo.Column("strLeague", "TEXT", false, 0));
        _columnsTeams.put("strLocked", new TableInfo.Column("strLocked", "TEXT", false, 0));
        _columnsTeams.put("strManager", new TableInfo.Column("strManager", "TEXT", false, 0));
        _columnsTeams.put("strRSS", new TableInfo.Column("strRSS", "TEXT", false, 0));
        _columnsTeams.put("strSport", new TableInfo.Column("strSport", "TEXT", false, 0));
        _columnsTeams.put("strStadium", new TableInfo.Column("strStadium", "TEXT", false, 0));
        _columnsTeams.put("strStadiumDescription", new TableInfo.Column("strStadiumDescription", "TEXT", false, 0));
        _columnsTeams.put("strStadiumLocation", new TableInfo.Column("strStadiumLocation", "TEXT", false, 0));
        _columnsTeams.put("strStadiumThumb", new TableInfo.Column("strStadiumThumb", "TEXT", false, 0));
        _columnsTeams.put("strTeam", new TableInfo.Column("strTeam", "TEXT", false, 0));
        _columnsTeams.put("strTeamBadge", new TableInfo.Column("strTeamBadge", "TEXT", false, 0));
        _columnsTeams.put("strTeamBanner", new TableInfo.Column("strTeamBanner", "TEXT", false, 0));
        _columnsTeams.put("strTeamFanart1", new TableInfo.Column("strTeamFanart1", "TEXT", false, 0));
        _columnsTeams.put("strTeamFanart2", new TableInfo.Column("strTeamFanart2", "TEXT", false, 0));
        _columnsTeams.put("strTeamFanart3", new TableInfo.Column("strTeamFanart3", "TEXT", false, 0));
        _columnsTeams.put("strTeamFanart4", new TableInfo.Column("strTeamFanart4", "TEXT", false, 0));
        _columnsTeams.put("strTeamJersey", new TableInfo.Column("strTeamJersey", "TEXT", false, 0));
        _columnsTeams.put("strTeamLogo", new TableInfo.Column("strTeamLogo", "TEXT", false, 0));
        _columnsTeams.put("strTeamShort", new TableInfo.Column("strTeamShort", "TEXT", false, 0));
        _columnsTeams.put("strTwitter", new TableInfo.Column("strTwitter", "TEXT", false, 0));
        _columnsTeams.put("strWebsite", new TableInfo.Column("strWebsite", "TEXT", false, 0));
        _columnsTeams.put("strYoutube", new TableInfo.Column("strYoutube", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTeams = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTeams = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTeams = new TableInfo("teams", _columnsTeams, _foreignKeysTeams, _indicesTeams);
        final TableInfo _existingTeams = TableInfo.read(_db, "teams");
        if (! _infoTeams.equals(_existingTeams)) {
          throw new IllegalStateException("Migration didn't properly handle teams(com.dake.foorballapps.vo.Team).\n"
                  + " Expected:\n" + _infoTeams + "\n"
                  + " Found:\n" + _existingTeams);
        }
        final HashMap<String, TableInfo.Column> _columnsPlayers = new HashMap<String, TableInfo.Column>(48);
        _columnsPlayers.put("idPlayer", new TableInfo.Column("idPlayer", "TEXT", true, 1));
        _columnsPlayers.put("idTeam", new TableInfo.Column("idTeam", "TEXT", true, 2));
        _columnsPlayers.put("dateBorn", new TableInfo.Column("dateBorn", "TEXT", false, 0));
        _columnsPlayers.put("dateSigned", new TableInfo.Column("dateSigned", "TEXT", false, 0));
        _columnsPlayers.put("idPlayerManager", new TableInfo.Column("idPlayerManager", "TEXT", false, 0));
        _columnsPlayers.put("idSoccerXML", new TableInfo.Column("idSoccerXML", "TEXT", false, 0));
        _columnsPlayers.put("intLoved", new TableInfo.Column("intLoved", "TEXT", false, 0));
        _columnsPlayers.put("intSoccerXMLTeamID", new TableInfo.Column("intSoccerXMLTeamID", "TEXT", false, 0));
        _columnsPlayers.put("strBanner", new TableInfo.Column("strBanner", "TEXT", false, 0));
        _columnsPlayers.put("strBirthLocation", new TableInfo.Column("strBirthLocation", "TEXT", false, 0));
        _columnsPlayers.put("strCollege", new TableInfo.Column("strCollege", "TEXT", false, 0));
        _columnsPlayers.put("strCutout", new TableInfo.Column("strCutout", "TEXT", false, 0));
        _columnsPlayers.put("strDescriptionCN", new TableInfo.Column("strDescriptionCN", "TEXT", false, 0));
        _columnsPlayers.put("strDescriptionDE", new TableInfo.Column("strDescriptionDE", "TEXT", false, 0));
        _columnsPlayers.put("strDescriptionEN", new TableInfo.Column("strDescriptionEN", "TEXT", false, 0));
        _columnsPlayers.put("strDescriptionES", new TableInfo.Column("strDescriptionES", "TEXT", false, 0));
        _columnsPlayers.put("strDescriptionFR", new TableInfo.Column("strDescriptionFR", "TEXT", false, 0));
        _columnsPlayers.put("strDescriptionHU", new TableInfo.Column("strDescriptionHU", "TEXT", false, 0));
        _columnsPlayers.put("strDescriptionIL", new TableInfo.Column("strDescriptionIL", "TEXT", false, 0));
        _columnsPlayers.put("strDescriptionIT", new TableInfo.Column("strDescriptionIT", "TEXT", false, 0));
        _columnsPlayers.put("strDescriptionJP", new TableInfo.Column("strDescriptionJP", "TEXT", false, 0));
        _columnsPlayers.put("strDescriptionNL", new TableInfo.Column("strDescriptionNL", "TEXT", false, 0));
        _columnsPlayers.put("strDescriptionNO", new TableInfo.Column("strDescriptionNO", "TEXT", false, 0));
        _columnsPlayers.put("strDescriptionPL", new TableInfo.Column("strDescriptionPL", "TEXT", false, 0));
        _columnsPlayers.put("strDescriptionPT", new TableInfo.Column("strDescriptionPT", "TEXT", false, 0));
        _columnsPlayers.put("strDescriptionRU", new TableInfo.Column("strDescriptionRU", "TEXT", false, 0));
        _columnsPlayers.put("strDescriptionSE", new TableInfo.Column("strDescriptionSE", "TEXT", false, 0));
        _columnsPlayers.put("strFacebook", new TableInfo.Column("strFacebook", "TEXT", false, 0));
        _columnsPlayers.put("strFanart1", new TableInfo.Column("strFanart1", "TEXT", false, 0));
        _columnsPlayers.put("strFanart2", new TableInfo.Column("strFanart2", "TEXT", false, 0));
        _columnsPlayers.put("strFanart3", new TableInfo.Column("strFanart3", "TEXT", false, 0));
        _columnsPlayers.put("strFanart4", new TableInfo.Column("strFanart4", "TEXT", false, 0));
        _columnsPlayers.put("strGender", new TableInfo.Column("strGender", "TEXT", false, 0));
        _columnsPlayers.put("strHeight", new TableInfo.Column("strHeight", "TEXT", false, 0));
        _columnsPlayers.put("strInstagram", new TableInfo.Column("strInstagram", "TEXT", false, 0));
        _columnsPlayers.put("strLocked", new TableInfo.Column("strLocked", "TEXT", false, 0));
        _columnsPlayers.put("strNationality", new TableInfo.Column("strNationality", "TEXT", false, 0));
        _columnsPlayers.put("strPlayer", new TableInfo.Column("strPlayer", "TEXT", false, 0));
        _columnsPlayers.put("strPosition", new TableInfo.Column("strPosition", "TEXT", false, 0));
        _columnsPlayers.put("strSigning", new TableInfo.Column("strSigning", "TEXT", false, 0));
        _columnsPlayers.put("strSport", new TableInfo.Column("strSport", "TEXT", false, 0));
        _columnsPlayers.put("strTeam", new TableInfo.Column("strTeam", "TEXT", false, 0));
        _columnsPlayers.put("strThumb", new TableInfo.Column("strThumb", "TEXT", false, 0));
        _columnsPlayers.put("strTwitter", new TableInfo.Column("strTwitter", "TEXT", false, 0));
        _columnsPlayers.put("strWage", new TableInfo.Column("strWage", "TEXT", false, 0));
        _columnsPlayers.put("strWebsite", new TableInfo.Column("strWebsite", "TEXT", false, 0));
        _columnsPlayers.put("strWeight", new TableInfo.Column("strWeight", "TEXT", false, 0));
        _columnsPlayers.put("strYoutube", new TableInfo.Column("strYoutube", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPlayers = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPlayers = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPlayers = new TableInfo("players", _columnsPlayers, _foreignKeysPlayers, _indicesPlayers);
        final TableInfo _existingPlayers = TableInfo.read(_db, "players");
        if (! _infoPlayers.equals(_existingPlayers)) {
          throw new IllegalStateException("Migration didn't properly handle players(com.dake.foorballapps.vo.Player).\n"
                  + " Expected:\n" + _infoPlayers + "\n"
                  + " Found:\n" + _existingPlayers);
        }
        final HashMap<String, TableInfo.Column> _columnsFavoriteMatches = new HashMap<String, TableInfo.Column>(1);
        _columnsFavoriteMatches.put("idMatch", new TableInfo.Column("idMatch", "TEXT", true, 1));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavoriteMatches = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavoriteMatches = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavoriteMatches = new TableInfo("favorite_matches", _columnsFavoriteMatches, _foreignKeysFavoriteMatches, _indicesFavoriteMatches);
        final TableInfo _existingFavoriteMatches = TableInfo.read(_db, "favorite_matches");
        if (! _infoFavoriteMatches.equals(_existingFavoriteMatches)) {
          throw new IllegalStateException("Migration didn't properly handle favorite_matches(com.dake.foorballapps.vo.FavoriteMatch).\n"
                  + " Expected:\n" + _infoFavoriteMatches + "\n"
                  + " Found:\n" + _existingFavoriteMatches);
        }
        final HashMap<String, TableInfo.Column> _columnsFavoriteTeams = new HashMap<String, TableInfo.Column>(1);
        _columnsFavoriteTeams.put("idTeam", new TableInfo.Column("idTeam", "TEXT", true, 1));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavoriteTeams = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavoriteTeams = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavoriteTeams = new TableInfo("favorite_teams", _columnsFavoriteTeams, _foreignKeysFavoriteTeams, _indicesFavoriteTeams);
        final TableInfo _existingFavoriteTeams = TableInfo.read(_db, "favorite_teams");
        if (! _infoFavoriteTeams.equals(_existingFavoriteTeams)) {
          throw new IllegalStateException("Migration didn't properly handle favorite_teams(com.dake.foorballapps.vo.FavoriteTeam).\n"
                  + " Expected:\n" + _infoFavoriteTeams + "\n"
                  + " Found:\n" + _existingFavoriteTeams);
        }
      }
    }, "c938fae2c84816465a48dfb1a6750dca", "414b5f27e4e1736ddcbc421ad4da8713");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "matches","teams","players","favorite_matches","favorite_teams");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `matches`");
      _db.execSQL("DELETE FROM `teams`");
      _db.execSQL("DELETE FROM `players`");
      _db.execSQL("DELETE FROM `favorite_matches`");
      _db.execSQL("DELETE FROM `favorite_teams`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public SportDao sportDao() {
    if (_sportDao != null) {
      return _sportDao;
    } else {
      synchronized(this) {
        if(_sportDao == null) {
          _sportDao = new SportDao_Impl(this);
        }
        return _sportDao;
      }
    }
  }
}
