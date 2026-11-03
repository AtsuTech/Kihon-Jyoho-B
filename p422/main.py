
def pow(a,b):
    temp = a
    # for i in range(b):
    #     if(i==0):
    #         a=a
    #     else:
    #         a*=a
    for i in range(b):
        temp = temp*a
    return a


print(pow(3,3))

def kNearestNeighbors(trailData,trailLabel,data,k):
    itemRank = []
    distRank = []
    labelList = []
    labelCount = []
    i=0
    j=0
    m=0
    count=0
    t=""
    label=""


    x=data[0]
    y=data[1]

    for i in range(trailData.count):
        xi = trailData[i,1]
        yi = trailData[i,2]
        #dist = 

    return


# cd p422
# python main.py