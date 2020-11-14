package org.cloudbus.cloudsim.container.resourceAllocatorMigrationEnabled;

import java.util.List;
import java.util.Map;

import org.cloudbus.cloudsim.container.containerSelectionPolicies.PowerContainerSelectionPolicy;
import org.cloudbus.cloudsim.container.core.ContainerHost;
import org.cloudbus.cloudsim.container.core.PowerContainerHost;
import org.cloudbus.cloudsim.container.hostSelectionPolicies.HostSelectionPolicy;
import org.cloudbus.cloudsim.container.vmSelectionPolicies.PowerContainerVmSelectionPolicy;

public class childclasstomigration extends PowerContainerVmAllocationPolicyMigrationAbstractContainerHostSelection {

   
   
    public childclasstomigration(List<? extends ContainerHost> hostList,
            PowerContainerVmSelectionPolicy vmSelectionPolicy,
            PowerContainerSelectionPolicy containerSelectionPolicy,
            HostSelectionPolicy hostSelectionPolicy,
            int numberOfVmTypes, int[] vmPes, float[] vmRam, long vmBw,
            long vmSize, double[] vmMips) {
        super(hostList, vmSelectionPolicy, containerSelectionPolicy, hostSelectionPolicy, numberOfVmTypes, vmPes, vmRam, vmBw,
                vmSize, vmMips);
    //this.tatortots();
    //List<PowerContainerHostUtilizationHistory> overUtilizedHosts = getOverUtilizedHosts();
     //List<? extends Container> containersToMigrate = getContainersToMigrateFromHosts(overUtilizedHosts);
    //super.optimizeAllocation(vmList);
     //List<Map<String, Object>> migrationMap=super.getNewContainerPlacement(containersToMigrate, overUtilizedHosts);
    //super.getContainerMigrationMapFromUnderUtilizedHosts(overUtilizedHosts, previouseMap);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected boolean isHostOverUtilized(PowerContainerHost host) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    protected boolean isHostUnderUtilized(PowerContainerHost host) {
        // TODO Auto-generated method stub
        return false;
    }
   
    //super.getContainerMigrationMapFromUnderUtilizedHosts();
   

   
}
