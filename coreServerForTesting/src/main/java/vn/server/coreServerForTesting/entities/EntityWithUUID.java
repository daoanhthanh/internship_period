package vn.server.coreServerForTesting.entities;

import org.hibernate.annotations.Type;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

/**
 * To help your entities, you’ll create a superclass that handles
 * the primary key in the same way for every entity we create.
 * PostgreSQL has support to UUID, so you are going to use it
 * instead of the commonly used auto-increment integer.
 * UUID is helpful to avoid a normal attack in which the hacker
 * tries to increase or decrease an entity ID to discover new information.
 */
@MappedSuperclass
public class EntityWithUUID {
    @Id
    @Type(type = "pg-uuid")
    private UUID id;

    public EntityWithUUID() {
        this.id = UUID.randomUUID();
    }
}
