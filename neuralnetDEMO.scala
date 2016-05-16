/* SCALA NEURAL NET DEMO
by M.Kabir
*/

//First, create a string that represents the absolute path to the 'scalatoy.csv' file
var filename = "C:/Example/Directory/Add/Your/Own/Please"

//Then we can immediately get to training, for, let's say 400 iterations
var trainedlayers = NeuralNetTrainer(filename,400)

//Now we have trained layers to use in our predictor
//Provide it with any feature data to have it spit out an array of 0s or 1s
//Below I just provide it with one datapoint
var Predictions = NeuralNetPredictor(Array(Array(0.0, 3.0, 2.0, 4.0, 7.0)), trainedlayers)