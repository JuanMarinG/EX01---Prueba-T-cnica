// Generated with g9.

package com.juan.pt.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Grupos implements Serializable {

    /** Primary key. */
    protected static final String PK = "idGrupo";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(name="id_grupo", unique=true, nullable=false, length=4)
    private String idGrupo;
    @Column(name="nombre_grupo", nullable=false, length=150)
    private String nombreGrupo;
    @Column(name="Juego", nullable=false, length=100)
    private String juego;
    @Column(name="Jugadores", length=100)
    private String jugadores;
    private String foreign1;
    private String foreign;

    /** Default constructor. */
    public Grupos() {
        super();
    }

    /**
     * Access method for idGrupo.
     *
     * @return the current value of idGrupo
     */
    public String getIdGrupo() {
        return idGrupo;
    }

    /**
     * Setter method for idGrupo.
     *
     * @param aIdGrupo the new value for idGrupo
     */
    public void setIdGrupo(String aIdGrupo) {
        idGrupo = aIdGrupo;
    }

    /**
     * Access method for nombreGrupo.
     *
     * @return the current value of nombreGrupo
     */
    public String getNombreGrupo() {
        return nombreGrupo;
    }

    /**
     * Setter method for nombreGrupo.
     *
     * @param aNombreGrupo the new value for nombreGrupo
     */
    public void setNombreGrupo(String aNombreGrupo) {
        nombreGrupo = aNombreGrupo;
    }

    /**
     * Access method for juego.
     *
     * @return the current value of juego
     */
    public String getJuego() {
        return juego;
    }

    /**
     * Setter method for juego.
     *
     * @param aJuego the new value for juego
     */
    public void setJuego(String aJuego) {
        juego = aJuego;
    }

    /**
     * Access method for jugadores.
     *
     * @return the current value of jugadores
     */
    public String getJugadores() {
        return jugadores;
    }

    /**
     * Setter method for jugadores.
     *
     * @param aJugadores the new value for jugadores
     */
    public void setJugadores(String aJugadores) {
        jugadores = aJugadores;
    }

    /**
     * Access method for foreign.
     *
     * @return the current value of foreign
     */
    public String getForeign1() {
        return foreign1;
    }

    /**
     * Setter method for foreign.
     *
     * @param aForeign the new value for foreign
     */
    public void setForeign1(String aForeign1) {
        foreign1 = aForeign1;
    }

    /**
     * Access method for foreign.
     *
     * @return the current value of foreign
     */
    public String getForeign() {
        return foreign;
    }

    /**
     * Setter method for foreign.
     *
     * @param aForeign the new value for foreign
     */
    public void setForeign(String aForeign) {
        foreign = aForeign;
    }

    /**
     * Compares the key for this instance with another Grupos.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Grupos and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Grupos)) {
            return false;
        }
        Grupos that = (Grupos) other;
        Object myIdGrupo = this.getIdGrupo();
        Object yourIdGrupo = that.getIdGrupo();
        if (myIdGrupo==null ? yourIdGrupo!=null : !myIdGrupo.equals(yourIdGrupo)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Grupos.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Grupos)) return false;
        return this.equalKeys(other) && ((Grupos)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        if (getIdGrupo() == null) {
            i = 0;
        } else {
            i = getIdGrupo().hashCode();
        }
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Grupos |");
        sb.append(" idGrupo=").append(getIdGrupo());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("idGrupo", getIdGrupo());
        return ret;
    }

}
