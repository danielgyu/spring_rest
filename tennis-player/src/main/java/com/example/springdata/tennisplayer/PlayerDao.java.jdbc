package com.example.springdata.tennisplayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class PlayerDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int insertPlayer(Player player) {
	String sql = "INSERT INTO player (id, name, nationality, birth_date, titles) VALUES (?, ?, ?, ?, ?)";
	return jdbcTemplate.update(sql,
		new Object[] {
		    player.getId(),
		    player.getName(),
		    player.getNationality(),
		    new Timestamp(player.getBirthDate().getTime()),
		    player.getTitles()
		});
    }

    public List<Player> getAllPlayers() {
        String sql = "SELECT * FROM player";
        return jdbcTemplate.query(sql,
		new BeanPropertyRowMapper<Player>(Player.class));
    }

    public Player getPlayerById(int id) {
        String sql = "SELECT * FROM player WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,
		new BeanPropertyRowMapper<Player>(Player.class),
		new Object[] {id});
    }

    public List<Player> getPlayersByNationality(String nation) {
	String sql = "SELECT * FROM player WHERE nationality = ?";
	return jdbcTemplate.query(sql,
		new PlayerMapper(),
		new Object[] {nation});
    }

    private static final class PlayerMapper implements RowMapper {

	@Override
	public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
	    Player player = new Player();
	    System.out.println("result set: " + rs);
	    player.setId(rs.getInt("id"));
	    player.setName(rs.getString("name"));
	    player.setNationality(rs.getString("nationality"));
	    player.setBirthDate(rs.getDate("birth_date"));
	    player.setTitles(rs.getInt("titles"));
	    return player; 
	}

    }
}
