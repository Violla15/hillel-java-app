package ua.ithillel.hillelwebapp.entity;

import lombok.Getter;

@Getter

public enum Role {
    ADMIN(1),
    MANAGER(2),
    CLIENT(3);

    private final int value;

    Role(int value) {
        this.value = value;
    }
}
