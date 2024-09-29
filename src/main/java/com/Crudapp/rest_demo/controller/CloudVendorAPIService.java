package com.Crudapp.rest_demo.controller;

import com.Crudapp.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

  CloudVendor cloudVendor;
    @GetMapping ("{vendorId}")
public CloudVendor getCloudVendorDetails(String vendorId){
//    return new CloudVendor(vendorId:"C1", vendorName:"Vendor 1", vendorAddress:"Address one", vendorPhoneNumber:"YYY");
    return cloudVendor;
}

@PostMapping
public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
{
    this.cloudVendor = cloudVendor;
    return "Cloud Vendor Created Successfully";
}
@PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor updated Successfully";
    }
    @DeleteMapping
    public String deleteCloudVendorDetails(String vendorId)
    {
        this.cloudVendor = null;
        return "Cloud Vendor deleted Successfully";
    }


}
