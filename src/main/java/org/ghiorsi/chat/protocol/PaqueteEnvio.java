package org.ghiorsi.chat.protocol;

import java.io.Serializable;

public class PaqueteEnvio implements Serializable {

    /**
     * This class will be i charge of send the information to the Server, for this, it needs to implement Serializable
     */

    private String nick, ip, mensaje;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
