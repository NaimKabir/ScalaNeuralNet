def square(x: Double) : Double = x*x

def abs(x: Double) : Double = if (x < 0) -x else x

def CheckRtGoodness(estimation: Double, GroundTruth: Double) : Boolean = abs(square(estimation) - GroundTruth) < 0.001

def improveGuess(guess: Double, x: Double) : Double = (guess + x/guess)/2

def sqrt(guess: Double, query: Double) : Double = {
	if (CheckRtGoodness(guess, query)) guess
	else sqrt(improveGuess(guess, query), query)}
	