package com.capitalone.dashboard.collector;

import com.capitalone.dashboard.misc.HygieiaException;
import com.capitalone.dashboard.model.WhiteSourceChangeRequest;
import com.capitalone.dashboard.model.WhiteSourceComponent;
import com.capitalone.dashboard.model.LibraryPolicyResult;
import com.capitalone.dashboard.model.WhiteSourceProduct;
import java.util.List;

public interface WhiteSourceClient {
    List<WhiteSourceProduct> getProducts(String instanceUrl,String orgToken,String orgName) throws HygieiaException;
    List<WhiteSourceComponent> getAllProjectsForProduct(String instanceUrl,WhiteSourceProduct product,String orgToken,String orgName);
    LibraryPolicyResult getProjectInventory(String instanceUrl, WhiteSourceComponent whiteSourceComponent);
    LibraryPolicyResult getProjectAlerts(String instanceUrl, WhiteSourceComponent whiteSourceComponent);
    String getOrgDetails(String instanceUrl, String orgToken) throws HygieiaException;
    List<WhiteSourceChangeRequest> getChangeRequestLog(String instanceUrl, String orgToken, String orgName,long collectorLastUpdatedTime);
}
