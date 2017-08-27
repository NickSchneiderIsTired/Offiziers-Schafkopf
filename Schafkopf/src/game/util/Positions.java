package game.util;

public class Positions {
	
	public Position[] positions;
	public Position[] playedPosition;
	
	public Positions() {
		positions = new Position[32];
		positions[0] = Position.p1;
		positions[1] = Position.p2;
		positions[2] = Position.p3;
		positions[3] = Position.p4;
		positions[4] = Position.p5;
		positions[5] = Position.p6;
		positions[6] = Position.p7;
		positions[7] = Position.p8;
		positions[8] = Position.p9;
		positions[9] = Position.p10;
		positions[10] = Position.p11;
		positions[11] = Position.p12;
		positions[12] = Position.p13;
		positions[13] = Position.p14;
		positions[14] = Position.p15;
		positions[15] = Position.p16;
		positions[16] = Position.p17;
		positions[17] = Position.p18;
		positions[18] = Position.p19;
		positions[19] = Position.p20;
		positions[20] = Position.p21;
		positions[21] = Position.p22;
		positions[22] = Position.p23;
		positions[23] = Position.p24;
		positions[24] = Position.p25;
		positions[25] = Position.p26;
		positions[26] = Position.p27;
		positions[27] = Position.p28;
		positions[28] = Position.p29;
		positions[29] = Position.p30;
		positions[30] = Position.p31;
		positions[31] = Position.p32;
		playedPosition = new Position[2];
		playedPosition[0] = Position.played1;
		playedPosition[1] = Position.played2;
	}

}
