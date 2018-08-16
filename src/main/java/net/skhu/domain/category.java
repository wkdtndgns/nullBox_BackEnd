package net.skhu.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class category {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
	int gameId;
	String name;
	int difficult;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getDifficult() {
		return difficult;
	}
	public void setDifficult(int difficult) {
		this.difficult = difficult;
	}
	
	
	

}
