package com.poja.prime.endpoint.event;

import java.math.BigInteger;
import java.util.Random;

public class PojaPrime {
    public static BigInteger getPrime(){
        return BigInteger.probablePrime(1000,new Random());
    }
}
