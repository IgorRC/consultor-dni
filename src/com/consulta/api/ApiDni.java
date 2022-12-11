/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consulta.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import com.consulta.modelo.Persona;
import com.google.gson.Gson;

/**
 *
 * @author igor
 */
public class ApiDni {
    public Persona fetchApi(String dni) throws IOException {
        URL jsonpath = new URL("https://dniruc.apisperu.com/api/v1/dni/"+ dni +"?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJlbWFpbCI6Imlnb3IucmFtb3MuY0Bob3RtYWlsLmNvbSJ9.TOd_J0nrCr_jCA5iVbBuFIlyNc3_It0cS2XeC0BpZ7w");
        URLConnection urlcon = jsonpath.openConnection();
        BufferedReader buffread = new BufferedReader(new InputStreamReader(urlcon.getInputStream())); 
        String json = buffread.readLine();
        buffread.close();
        
        Gson gson = new Gson();
        Persona persona = gson.fromJson(json,Persona.class);
        return persona;
    }
}
