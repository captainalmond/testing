module ratedividerattempt1(rate, reset, clk, counterout);
	
	input reset; //to reset counter
	input [26:0] rate; //inputted rate, max is 50mil (min 27 bits)
	input clk; //CLOCK_50
	output reg [26:0] counterout; //should output the counter
	
	//count up on rising edge
	always@(posedge clk)
	begin
		if(reset) //if reset is active, counterout should be 0
			counterout <= 27'b0;
		//else if(counterout == (rate - 1'b1))
		//	counterout <= rate;
		else if(counterout == rate) //we reached our rate, so set back to 0
			counterout <= 27'b0;
		else //count up
			counterout <= counterout + 1'b1;
	end

endmodule