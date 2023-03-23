const readline = require("readline");

function challengeOne() {
	const rl = readline.createInterface({
		input: process.stdin,
		output: process.stdout,
	});

	rl.question("Please enter a two numbers (separated by a space): ", (ans) => 

		{
			let inputs = ans.split(" ");
			if(inputs.length == 2){
				let sum = addition(inputs[0], inputs[1]);
				if(isNaN(sum)){
					console.log('Invalid arguments. Must be two numbers.');
				} else {		
					console.log(`${inputs[0]} + ${inputs[1]} = ${sum}`)
				}
			} else {
				console.log('Invalid arguments. Must be two numbers.');
			}
			rl.close();
		});
}
function addition(a, b) {
	let aNum = parseFloat(a);
	let bNum = parseFloat(b);
	return aNum + bNum;	
}

function challengeTwo() {
	console.log("Increment 0: " + addition(0)); // 1
	let a = 54;
	console.log("a start: " + a); // 54
	a = addition(a);
	a = addition(a);
	console.log("a end: " + a); // 56
}

function addition(a) {
	return a + 1;
}


// challengeOne();
challengeTwo();

