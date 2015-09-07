package com.mmadapps.retrofitexample;

import java.util.List;

/**
 * Created by gangadhar.g on 9/7/2015.
 */

public class Curator {
    public String title;
    public List<Dataset> dataset;

    public class Dataset{
        String curator_title;
        String curator_tagline;
    }
}

