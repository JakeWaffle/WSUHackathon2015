package com.lcsc.hackathon.events;

import com.lcsc.hackathon.EsperHandler;

import java.util.List;
import java.util.ArrayList;

public class EventFactory {
    List<AngleRule> angleRules = new ArrayList<AngleRule>();
    List<DistanceRule> distRules = new ArrayList<DistanceRule>();
    
    public EventFactory() {
    }
    
    public void addAngleRule(AngleRule rule) {
        angleRules.add(rule);
    }
    
    public void addDistanceRule(DistanceRule rule) {
        distRules.add(rule);
    }
    
    public void getEventData(/*j4k skeleton,*/ EsperHandler eHandler) {
        //loop through all of the angle/distRules and 
        //update them with information from the current skeleton.
        
        //Then pass all of the rules to eHandler using sendEvent().
    }
}