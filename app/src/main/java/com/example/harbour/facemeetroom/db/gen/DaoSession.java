package com.example.harbour.facemeetroom.db.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.harbour.facemeetroom.db.entity.EmailPassword;
import com.example.harbour.facemeetroom.db.entity.Room;
import com.example.harbour.facemeetroom.db.entity.RoomReserveUp;
import com.example.harbour.facemeetroom.db.entity.User;
import com.example.harbour.facemeetroom.db.entity.RoomTimes;
import com.example.harbour.facemeetroom.db.entity.RecommendRoom;

import com.example.harbour.facemeetroom.db.gen.EmailPasswordDao;
import com.example.harbour.facemeetroom.db.gen.RoomDao;
import com.example.harbour.facemeetroom.db.gen.RoomReserveUpDao;
import com.example.harbour.facemeetroom.db.gen.UserDao;
import com.example.harbour.facemeetroom.db.gen.RoomTimesDao;
import com.example.harbour.facemeetroom.db.gen.RecommendRoomDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig emailPasswordDaoConfig;
    private final DaoConfig roomDaoConfig;
    private final DaoConfig roomReserveUpDaoConfig;
    private final DaoConfig userDaoConfig;
    private final DaoConfig roomTimesDaoConfig;
    private final DaoConfig recommendRoomDaoConfig;

    private final EmailPasswordDao emailPasswordDao;
    private final RoomDao roomDao;
    private final RoomReserveUpDao roomReserveUpDao;
    private final UserDao userDao;
    private final RoomTimesDao roomTimesDao;
    private final RecommendRoomDao recommendRoomDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        emailPasswordDaoConfig = daoConfigMap.get(EmailPasswordDao.class).clone();
        emailPasswordDaoConfig.initIdentityScope(type);

        roomDaoConfig = daoConfigMap.get(RoomDao.class).clone();
        roomDaoConfig.initIdentityScope(type);

        roomReserveUpDaoConfig = daoConfigMap.get(RoomReserveUpDao.class).clone();
        roomReserveUpDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        roomTimesDaoConfig = daoConfigMap.get(RoomTimesDao.class).clone();
        roomTimesDaoConfig.initIdentityScope(type);

        recommendRoomDaoConfig = daoConfigMap.get(RecommendRoomDao.class).clone();
        recommendRoomDaoConfig.initIdentityScope(type);

        emailPasswordDao = new EmailPasswordDao(emailPasswordDaoConfig, this);
        roomDao = new RoomDao(roomDaoConfig, this);
        roomReserveUpDao = new RoomReserveUpDao(roomReserveUpDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);
        roomTimesDao = new RoomTimesDao(roomTimesDaoConfig, this);
        recommendRoomDao = new RecommendRoomDao(recommendRoomDaoConfig, this);

        registerDao(EmailPassword.class, emailPasswordDao);
        registerDao(Room.class, roomDao);
        registerDao(RoomReserveUp.class, roomReserveUpDao);
        registerDao(User.class, userDao);
        registerDao(RoomTimes.class, roomTimesDao);
        registerDao(RecommendRoom.class, recommendRoomDao);
    }
    
    public void clear() {
        emailPasswordDaoConfig.clearIdentityScope();
        roomDaoConfig.clearIdentityScope();
        roomReserveUpDaoConfig.clearIdentityScope();
        userDaoConfig.clearIdentityScope();
        roomTimesDaoConfig.clearIdentityScope();
        recommendRoomDaoConfig.clearIdentityScope();
    }

    public EmailPasswordDao getEmailPasswordDao() {
        return emailPasswordDao;
    }

    public RoomDao getRoomDao() {
        return roomDao;
    }

    public RoomReserveUpDao getRoomReserveUpDao() {
        return roomReserveUpDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public RoomTimesDao getRoomTimesDao() {
        return roomTimesDao;
    }

    public RecommendRoomDao getRecommendRoomDao() {
        return recommendRoomDao;
    }

}
