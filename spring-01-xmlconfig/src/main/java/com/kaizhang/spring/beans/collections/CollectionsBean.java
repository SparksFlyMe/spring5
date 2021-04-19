package com.kaizhang.spring.beans.collections;

import com.kaizhang.spring.beans.dependencyinjection.Common;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author kaizhang
 * @date 2021-04-19 22:14
 */
public class CollectionsBean {
    public Properties myProperties;

    public List<String> myList;

    public Map<String, String> myMap;

    public Set<String> mySet;

    public void setMyProperties(Properties myProperties) {
        this.myProperties = myProperties;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    @Override
    public String toString() {
        return "CollectionsBean{" +
                "myProperties=" + myProperties +
                ", myList=" + myList +
                ", myMap=" + myMap +
                ", mySet=" + mySet +
                '}';
    }
}
