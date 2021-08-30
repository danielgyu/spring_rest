package com.example.springdata.tennisplayer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PlayerRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Player insertPlayer(Player player) {
	return entityManager.merge(player);
    }

    public Player updatePlayer(Player player) {
	return entityManager.merge(player);
    }
}
