package src.topinterview150;

public class LC_134_GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        for(int start=0; start<gas.length; start++) {
            if(gas[start] >= cost[start]) {
                int reach = getReachPoint(start, gas, cost);
                if(reach == start) return start;
                if(start > reach) break;
                start = reach;
            }
        }
        return -1;
    }

    public int getReachPoint(int start, int[] gas, int[] cost) {
        int reach = start == gas.length-1? 0: start + 1;
        int remainingGas = gas[start] - cost[start];
        while(reach != start) {
            remainingGas += gas[reach] - cost[reach];
            if(remainingGas < 0) break;
            reach++;
            if(reach == gas.length) reach = 0;
        }
        return reach;
    }

}
