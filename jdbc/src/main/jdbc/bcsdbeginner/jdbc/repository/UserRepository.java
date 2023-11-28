package bcsdbeginner.jdbc.repository;

import bcsdbeginner.jdbc.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserRepository {
    public Integer save(User user) {
        Connection connection = null;
        PreparedStatement statement = null;
        return 0;
    }
}
