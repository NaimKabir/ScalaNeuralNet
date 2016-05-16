# Basic Neural Net (In Scala)
by Naim Kabir

This is a neural net binary classifier.
***
# Demo
A short demo can be found in neuralnetDEMO.scala
This shows, line by line, how the below functions are meant to be used.

Toy feature/target data (scalatoy.csv) is used with a tiny Python script(scalatoygenerator.py) that generates target values based on an arbitrary rule I made up. The rule was: if feature 2 or 5 are above 5.0 in value, the target label is 1.

The idea was to get the neural network to pick up on that rule.

General workflow:
* A CSV of training features with target labels appended as the last column is read into the NeuralNetTrainer.
* The NeuralNetTrainer adjusts weights over however many iterations the user specifies
* After training, the NeuralNetTrainer spits out the trained weights in the synaptic layers
* Feature data and the trained weights are fed into the NeuralNetPredictor
* The NeuralNetPredictor predicts if datapoints are 0s or 1s.

I've not yet investigated how many iterations are optimal for learning the general rule which I used to create the training data.
***
# The Cool Top-Level Functions:
**The Trainer. This trains 'synaptic layer' weights on some training data.**
* NeuralNetTrainer( arg1 = Array(Array(Double)): This is an array of arrays representing data, with targets being the final column, arg2 = Integer: This is a number telling the NeuralNet to iterate [Integer] times.)

**The Predictor. This predicts binary values based on input feature data.**
* NeuralNetPredictor(arg1 = Array(Array(Double)): Array of arrays of features only, arg2 = (Array(Array(Double)), Array(Double)): This tuple of arrays is the layers output from NeuralNetTrainer)

***
# Underlying Functions:
* readCSVtoDouble: This reads a CSV file into an Array made of Array[Double].
As an exercise, I tried writing all the linear algebra functions I'd need from scratch. These are:
* dot: Perform a dot product between two vectors
* T: perform a transpose on my Array of Arrays constructs (Which...I should really change to something less clunky)
* matmultiply: Multiply two 'matrices' (They are really just arrays of arrays)
* piecewise: Perform piecewise multiplication of two vectors
* piecewiseAdd: Perform piecewise ADDITION of two vectors
* sigmoid: This simply feeds an input number through the sigmoidal function, 1/(1+exp(-x))

***
# Resources
This project would be dead in the water without these sources:
* Python Basic Neural Net: http://iamtrask.github.io/2015/07/12/basic-python-network/
* Learning Scala By Example: http://www.scala-lang.org/docu/files/ScalaByExample.pdf
* Linear Algebra In Scala: http://www.scalaclass.com/book/export/html/1
