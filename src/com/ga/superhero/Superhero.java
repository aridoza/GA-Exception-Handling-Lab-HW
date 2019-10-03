package com.ga.superhero;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.*;
import java.util.*;

public class Superhero {
    private String heroName;
    private String heroRealName;
    private String city;


    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroRealName() {
        return heroRealName;
    }

    public void setHeroRealName(String heroRealName) {
        this.heroRealName = heroRealName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
