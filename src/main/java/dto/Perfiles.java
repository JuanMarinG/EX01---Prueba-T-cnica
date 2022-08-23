// Generated with g9.

package com.juan.pt.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;


@Entity
public class Perfiles implements Serializable {

    /** Primary key. */
    protected static final String PK = "idPerfil";

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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_perfil", unique=true, nullable=false)
    private int idPerfil;
    @Column(nullable=false, length=100)
    private String nombre;
    @Column(nullable=false, length=100)
    private String apellidos;
    @Column(nullable=false)
    private int edad;
    @Column(length=50)
    private String email;
    @OneToMany(mappedBy="perfiles")
    private Set<Partidas> partidas;
    @ManyToOne
    @JoinColumn(name="id_roles")
    private Roles roles;

    /** Default constructor. */
    public Perfiles() {
        super();
    }

    /**
     * Access method for idPerfil.
     *
     * @return the current value of idPerfil
     */
    public int getIdPerfil() {
        return idPerfil;
    }

    /**
     * Setter method for idPerfil.
     *
     * @param aIdPerfil the new value for idPerfil
     */
    public void setIdPerfil(int aIdPerfil) {
        idPerfil = aIdPerfil;
    }

    /**
     * Access method for nombre.
     *
     * @return the current value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter method for nombre.
     *
     * @param aNombre the new value for nombre
     */
    public void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * Access method for apellidos.
     *
     * @return the current value of apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Setter method for apellidos.
     *
     * @param aApellidos the new value for apellidos
     */
    public void setApellidos(String aApellidos) {
        apellidos = aApellidos;
    }

    /**
     * Access method for edad.
     *
     * @return the current value of edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Setter method for edad.
     *
     * @param aEdad the new value for edad
     */
    public void setEdad(int aEdad) {
        edad = aEdad;
    }

    /**
     * Access method for email.
     *
     * @return the current value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for email.
     *
     * @param aEmail the new value for email
     */
    public void setEmail(String aEmail) {
        email = aEmail;
    }

    /**
     * Access method for partidas.
     *
     * @return the current value of partidas
     */
    public Set<Partidas> getPartidas() {
        return partidas;
    }

    /**
     * Setter method for partidas.
     *
     * @param aPartidas the new value for partidas
     */
    public void setPartidas(Set<Partidas> aPartidas) {
        partidas = aPartidas;
    }

    /**
     * Access method for roles.
     *
     * @return the current value of roles
     */
    public Roles getRoles() {
        return roles;
    }

    /**
     * Setter method for roles.
     *
     * @param aRoles the new value for roles
     */
    public void setRoles(Roles aRoles) {
        roles = aRoles;
    }

    /**
     * Compares the key for this instance with another Perfiles.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Perfiles and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Perfiles)) {
            return false;
        }
        Perfiles that = (Perfiles) other;
        if (this.getIdPerfil() != that.getIdPerfil()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Perfiles.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Perfiles)) return false;
        return this.equalKeys(other) && ((Perfiles)other).equalKeys(this);
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
        i = getIdPerfil();
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
        StringBuffer sb = new StringBuffer("[Perfiles |");
        sb.append(" idPerfil=").append(getIdPerfil());
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
        ret.put("idPerfil", Integer.valueOf(getIdPerfil()));
        return ret;
    }

}
