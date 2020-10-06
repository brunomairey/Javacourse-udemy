public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0 || smallCount < 0 || goal < 0)) {
            return false;
        }
        if (bigCount * 5 + smallCount == goal) {
            return true;
        } else {
            for (int i = 0; i <= bigCount; i++) {
                for (int j = 0; j <= smallCount; j++) {
                    if (i * 5 + j == goal) {
                        return true;
                    }
                }
            }

        }
        return false;

    }
}
//
//        public static boolean canPack2(int bigCount, int smallCount, int goal) {
//            if (bigCount < 0 || smallCount < 0) {
//                return false;
//            } else {
//                if (bigCount * 5 + smallCount == goal)
//                    return true;
//                else if (bigCount * 5 + smallCount < goal)
//                    return false;
//                else {
//                    for (int i = 0; i <= bigCount; i++) {
//                        for (int j = 0; j <= smallCount; j++) {
//                            if (i*5 +j==goal){
//                                return true;
//                            }
//                        }
//                    }
//                }
//            }
//            return false;
//        }
   //    }


