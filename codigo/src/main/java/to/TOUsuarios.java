
package to;

import java.util.Date;

public class TOUsuarios {
    
    private int idUsuarios;
    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private String identificacion;
    private String rollUsuario;
    private String direccion;
    private String telefono;
    private String correo;
    private Date fechaNaciomiento;
    private String estadoCivil;
    private String genero;

    public TOUsuarios(int idUsuarios, String nombres, String apellidos, String tipoDocumento, String identificacion, String rollUsuario, String direccion, String telefono, String correo, Date fechaNaciomiento, String estadoCivil, String genero) {
        this.idUsuarios = idUsuarios;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.identificacion = identificacion;
        this.rollUsuario = rollUsuario;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaNaciomiento = fechaNaciomiento;
        this.estadoCivil = estadoCivil;
        this.genero = genero;
    }

    public TOUsuarios() {
    }

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getRollUsuario() {
        return rollUsuario;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public Date getFechaNaciomiento() {
        return fechaNaciomiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getGenero() {
        return genero;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setRollUsuario(String rollUsuario) {
        this.rollUsuario = rollUsuario;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFechaNaciomiento(Date fechaNaciomiento) {
        this.fechaNaciomiento = fechaNaciomiento;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}
