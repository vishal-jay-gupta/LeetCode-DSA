class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] numsOfDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] arriveAliceTime = arriveAlice.split("-");
        String[] leaveAliceTime =  leaveAlice.split("-");
        String[] arriveBobTime =  arriveBob.split("-");
        String[] leaveBobTime =  leaveBob.split("-");

        int arriveAliceMonth = Integer.parseInt(arriveAliceTime[0]);
        int leaveAliceMonth = Integer.parseInt(leaveAliceTime[0]);

        int arriveBobMonth = Integer.parseInt(arriveBobTime[0]);
        int leaveBobMonth = Integer.parseInt(leaveBobTime[0]);

        int arriveAliceDays = 0;
        for(int i=0; i<arriveAliceMonth-1; i++){
            arriveAliceDays += numsOfDay[i];
        }

        int leaveAliceDays = 0;
        for(int i=0; i<leaveAliceMonth-1; i++){
            leaveAliceDays += numsOfDay[i];
        }


        int arriveBobDays = 0;
        for(int i=0; i<arriveBobMonth-1; i++){
            arriveBobDays += numsOfDay[i];
        }

        int leaveBobDays = 0;
        for(int i=0; i<leaveBobMonth-1; i++){
            leaveBobDays += numsOfDay[i];
        }

        arriveAliceDays += Integer.parseInt(arriveAliceTime[1]);
        leaveAliceDays += Integer.parseInt(leaveAliceTime[1]);
        arriveBobDays += Integer.parseInt(arriveBobTime[1]);
        leaveBobDays += Integer.parseInt(leaveBobTime[1]);

        int lastArrive = Math.max(arriveAliceDays, arriveBobDays);
        int firstLeave = Math.min(leaveAliceDays, leaveBobDays);

        return Integer.max(0, (firstLeave - lastArrive) + 1);
    }   
}