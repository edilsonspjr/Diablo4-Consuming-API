package com.diablo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Players {

    @Id
    private long battleTag;
    private String heroId;
    private String name;
    private String classe;
    private int level;
    private int power;
    private String skills;
    private boolean hardcore;
    private boolean dead;
    private long elites_killed;
    private boolean twitch;
    private long lastUpdate;


    public Players() {
    }

    public Players(long battleTag, String heroId, String name, String classe, int level, int power, String skills, boolean hardcore, boolean dead, long elites_killed, boolean twitch, long lastUpdate) {
        this.battleTag = battleTag;
        this.heroId = heroId;
        this.name = name;
        this.classe = classe;
        this.level = level;
        this.power = power;
        this.skills = skills;
        this.hardcore = hardcore;
        this.dead = dead;
        this.elites_killed = elites_killed;
        this.twitch = twitch;
        this.lastUpdate = lastUpdate;
    }

    public long getBattleTag() {
        return battleTag;
    }

    public String getHeroId() {
        return heroId;
    }

    public String getName() {
        return name;
    }

    public String getClasse() {
        return classe;
    }

    public int getLevel() {
        return level;
    }

    public int getPower() {
        return power;
    }

    public String getSkills() {
        return skills;
    }

    public boolean isHardcore() {
        return hardcore;
    }

    public boolean isDead() {
        return dead;
    }

    public long getElites_killed() {
        return elites_killed;
    }

    public boolean isTwitch() {
        return twitch;
    }

    public long getLastUpdate() {
        return lastUpdate;
    }

    public void setBattleTag(long battleTag) {
        this.battleTag = battleTag;
    }

    public void setHeroId(String heroId) {
        this.heroId = heroId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setHardcore(boolean hardcore) {
        this.hardcore = hardcore;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public void setElites_killed(long elites_killed) {
        this.elites_killed = elites_killed;
    }

    public void setTwitch(boolean twitch) {
        this.twitch = twitch;
    }

    public void setLastUpdate(long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Players players = (Players) o;
        return battleTag == players.battleTag && level == players.level && power == players.power && hardcore == players.hardcore && dead == players.dead && elites_killed == players.elites_killed && twitch == players.twitch && lastUpdate == players.lastUpdate && Objects.equals(heroId, players.heroId) && Objects.equals(name, players.name) && Objects.equals(classe, players.classe) && Objects.equals(skills, players.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(battleTag, heroId, name, classe, level, power, skills, hardcore, dead, elites_killed, twitch, lastUpdate);
    }

    @Override
    public String toString() {
        return "Players{" +
                "battleTag=" + battleTag +
                ", heroId='" + heroId + '\'' +
                ", name='" + name + '\'' +
                ", classe='" + classe + '\'' +
                ", level=" + level +
                ", power=" + power +
                ", skills='" + skills + '\'' +
                ", hardcore=" + hardcore +
                ", dead=" + dead +
                ", elites_killed=" + elites_killed +
                ", twitch=" + twitch +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
