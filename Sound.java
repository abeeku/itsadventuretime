
public class Sound {
	private int samples[];
	public int limitAmplitude(int limit) {
		int count = 0;
		for(int i=0;i<samples.length;i++) {
			if(samples[i]>limit) {
				samples[i]=limit;
				count++;
			}
			if(samples[i]<-limit) {
				samples[i]=-limit;
				count++;
			}
		}
		return count;
	}
	public void trimSilenceFromBeginning() {
		boolean isZero =true;
		int zeroes =0;
		for(int i=0;isZero==true;i++) {
			if(samples[i] != 0) {
				isZero = false;
			} else {
				zeroes++;
			}
			
		}
		int samples2[] = new int[samples.length-zeroes];
		for(int i=0;i<samples2.length;i++) {
			samples2[i] = samples[i+zeroes];
		}
	}
}
