/**
 * Resumen.
 * Objeto                   : Client.java
 * Descripción              : Clase de tipo document para obtener o establecer los datos de cada atributo.
 * Fecha de Creación        : 04/08/2022.
 * Proyecto de Creación     : Bootcamp-01.
 * Autor                    : Marvin Castro.
 * ---------------------------------------------------------------------------------------------------------------------------
 * Modificaciones
 * Motivo                   Fecha             Nombre                  Descripción
 * ---------------------------------------------------------------------------------------------------------------------------
 * Bootcamp-01              05/08/2022        Oscar Candela           Realizar la creación de un campo nuevo.
 */

package com.nttdata.bootcamp.client.model.document;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Clase de tipo document para obtener o establecer los datos de cada atributo.
 */
@Data
@ToString
@Document(collection="client_perfil_type")
public class ClientPerfilType {

    /** Identificador del Tipo Perfil */
    @Id
    private String id;

    /** Código del Tipo Perfil */
    private String code;

    /** Nombre del Tipo de Perfil */
    private String name;

    /** Estado del registro */
    private boolean state;

}
