# -*- coding: utf-8 -*-
"""
Created on Fri May 13 15:25:19 2016

@author: naimkabir
"""
import numpy as np
toy = np.random.randint(10, size = (150,5))

toytarget = np.zeros((150,1))

for i in range(1,150):
    if toy[i][1] >5 or toy[i][4] > 5:
        toytarget[i] = 1
        
fulltoy = np.concatenate((toy,toytarget), axis = 1)

numpy.savetxt("scalatoy.csv", fulltoy, delimiter=",", newline = '\n')