/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LMS;

import java.util.ArrayList;

/**
 *
 * @author Davin A
 */
public class HoldRequestOperations {
    ArrayList <HoldRequest> holdRequests;
    
    public HoldRequestOperations(){
    holdRequests = new ArrayList();
}
    
    public void addHoldRequest(HoldRequest hr)
    {
        holdRequests.add(hr);
    }
    
    // removing a hold req.
    public void removeHoldRequest()
    {
        if(!holdRequests.isEmpty())
        {
            holdRequests.remove(0);
        }
    }
}
