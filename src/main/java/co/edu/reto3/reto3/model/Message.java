package co.edu.reto3.reto3.model;
import java.io.Serializable;

import javax.persistence.*;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="message")
public class Message implements Serializable {
//Campo llave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;

// RELACION ENTRE COMPUTER Y MESSAGE
  /*   @ManyToOne
    @JoinColumn(name="id")//idComputer
    @JsonIgnoreProperties("message")
    private Computer computer;

// RELACION ENTRE CLIENT Y MESSAGE
    @ManyToOne
    @JoinColumn(name="idClient")
    @JsonIgnoreProperties("message")
    private Client client;
 */
//GETTERS AND SETTERS
    public Integer getIdMessage() {
        return idMessage;
    }
    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }
    public String getMessageText() {
        return messageText;
    }
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
