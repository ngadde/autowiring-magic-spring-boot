package com.github.pagram1975.autowiremagic.model.web;

public enum Genre {
    RNB{
        String externalName = new String ("R&B");

        public String toExternalForm() {
            return externalName;
        }
    },
    FOLK,
    POP,
    PUNK_POP {
        String externalName = new String ("Punk Pop");

        public String toExternalForm() {
            return externalName;
        }
    };

    public String toExternalForm() {
        return name().substring(0,1).toUpperCase() + name().substring(1).toLowerCase();
    }
}
