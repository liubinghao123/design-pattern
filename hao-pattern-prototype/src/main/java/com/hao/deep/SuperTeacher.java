package com.hao.deep;

import com.hao.simple.Prototype;
import com.hao.simple.Teacher;

import java.io.*;

/**
 * Created by Keeper on 2019-03-22
 */
public class SuperTeacher extends Teacher implements Cloneable, Serializable {
    private Certificate certificate;

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    @Override
    public Prototype clone() {
        return deepClone();
    }
    private Prototype deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.close();

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            ois.close();
            Prototype prototype = (Prototype) ois.readObject();
            return prototype;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
