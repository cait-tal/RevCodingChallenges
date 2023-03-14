const readline = require("readline");

const rl = readline.createInterface({
	input: process.stdin,
	output: process.stdout,
});

rl.question("Please enter a two numbers (separated by a space): ", (ans) => 

	{
		let inputs = ans.split(" ");
		if(inputs.length == 2){
			addition(inputs[0], inputs[1]);
		} else {
			console.log('Invalid arguments. Must be two numbers.');
		}
		rl.close();
	});

function addition(a, b) {
	let aNum = parseFloat(a);
	let bNum = parseFloat(b);
	if(isNaN(aNum) || isNaN(bNum)){
		console.log('Invalid arguments. Must be two numbers.');	
	} else {
		console.log(`${a} + ${b} = ${aNum + bNum}`);
	}
	
}