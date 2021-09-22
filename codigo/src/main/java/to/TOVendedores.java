
package to;

import java.util.Date;

public class TOVendedores {
   
   private int idVendedores;
   private int idUsuarioVendedor;
   private String usuario;
   private String clave;
   private Date fechaLogin;

    public TOVendedores(int idVendedores, int idUsuarioVendedor, String usuario, String clave, Date fechaLogin) {
        this.idVendedores = idVendedores;
        this.idUsuarioVendedor = idUsuarioVendedor;
        this.usuario = usuario;
        this.clave = clave;
        this.fechaLogin = fechaLogin;
    }

    public TOVendedores() {
    }

    public TOVendedores(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public int getIdVendedores() {
        return idVendedores;
    }

    public int getIdUsuarioVendedor() {
        return idUsuarioVendedor;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }
    public Date getFechaLogin() {
        return fechaLogin;
    }

    public void setIdVendedores(int idVendedores) {
        this.idVendedores = idVendedores;
    }

    public void setIdUsuarioVendedor(int idUsuarioVendedor) {
        this.idUsuarioVendedor = idUsuarioVendedor;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    public void setFechaLogin(Date fechaLogin) {
        this.fechaLogin = fechaLogin;
    } 
    
}
