// http://stackoverflow.com/questions/1318980/how-to-iterate-over-a-treemap

enum EligibilityResult { IS_ELIGIBLE, NOT_ELIGIBLE }

class Patient {
    String firstName, lastName, dateOfBirth, memberIDorAIN
    EligibilityResult eligibilityResult
}

Patient p1 = new Patient()
p1.firstName = "Marcus"
p1.lastName = "Rawson"
p1.dateOfBirth = "8/23/1968"

Patient p2 = new Patient()
p2.firstName = "Greg"
p2.lastName = "Harabedian"
p2.dateOfBirth = "10/19/1965"

def humanaEligibilityMock(Patient pat) {
    def tree
    tree = { -> return [:].withDefault{ tree() } }
    def member = tree()
    
    if (pat.firstName == "Marcus" && pat.lastName && "Rawson" && pat.dateOfBirth == "8/23/1968") {
        member.memberInfo.memberDetails.value.firstName.value = 'Marcus'
        member.memberInfo.memberDetails.value.lastName.value = 'Rawson'
        member.memberInfo.memberDetails.value.dateOfBirth.value = '8/23/1968'
        member.memberInfo.memberDetails.value.memberIDorAIN.value = "10418082368    "
        member.memberInfo.eligibilityResult = EligibilityResult.IS_ELIGIBLE
        member
    }
}

// memberInfo.memberDetails
def member = humanaEligibilityMock(p1)
//println member.dump()
assert member.memberInfo.memberDetails.value.firstName.value == "Marcus"
//println member.class
println  member.memberInfo.memberDetails.value.firstName.value
println  member.memberInfo.memberDetails.value.firstName
println  member.memberInfo.memberDetails.value
println  member.memberInfo.memberDetails
println  member.memberInfo
println  member
