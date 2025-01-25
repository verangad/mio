function updateProficiencies()
{
    let proficiencies = document.getElementById("proficiencies").value
    let languages = document.getElementById("languages").value

    fetch("/updateProficiencies", {
      method: "POST",
      body: JSON.stringify({
        proficiencies: proficiencies,
        languages: languages,
        completed: false
      }),
      headers: {
        "Content-type": "application/json; charset=UTF-8"
      }
    })
      .then((response) => response.json())
      .then((json) => console.log(json));
}

function updateSpellcasting()
{
    let scAbilityAddend = document.getElementById("sc-ability-addend").value
    let scAbility = document.getElementById("sc-ability").value
    let spellDCAddend = document.getElementById("spell-dc-addend").value
    let spellDC = document.getElementById("spell-dc").value
    let atkBonusAddend = document.getElementById("atkBonus-addend").value
    let atkBonus = document.getElementById("atkBonus").value

    fetch("/updateSpellcasting", {
      method: "POST",
      body: JSON.stringify({
        scAbility: {
            x: scAbilityAddend,
            y: scAbility
        },
        spellDC: {
            x: spellDCAddend,
            y: spellDC
        },
        atkBonus: {
            x: atkBonusAddend,
            y: atkBonus
        }
      }),
      headers: {
        "Content-type": "application/json; charset=UTF-8"
      }
    })
      .then((response) => response.json())
      .then((json) => console.log(json));
}

function updateSavingThrows()
{
    let strengthCheckbox = document.getElementById("strength-checkbox").checked
    let strength = document.getElementById("strength").value
    let dexterityCheckbox = document.getElementById("dexterity-checkbox").checked
    let dexterity = document.getElementById("dexterity").value
    let constitutionCheckbox = document.getElementById("constitution-checkbox").checked
    let constitution = document.getElementById("constitution").value
    let intelligenceCheckbox = document.getElementById("intelligence-checkbox").checked
    let intelligence = document.getElementById("intelligence").value
    let wisdomCheckbox = document.getElementById("wisdom-checkbox").checked
    let wisdom = document.getElementById("wisdom").value
    let charismaCheckbox = document.getElementById("charisma-checkbox").checked
    let charisma = document.getElementById("charisma").value

    fetch("/updateSavingThrows", {
      method: "POST",
      body: JSON.stringify({
        strength: {
            x: strength,
            y: strengthCheckbox
        },
        dexterity: {
            x: dexterity,
            y: dexterityCheckbox
        },
        constitution: {
            x: constitution,
            y: constitutionCheckbox
        },
        intelligence: {
            x: intelligence,
            y: intelligenceCheckbox
        },
        wisdom: {
            x: wisdom,
            y: wisdomCheckbox
        },
        charisma: {
            x: charisma,
            y: charismaCheckbox
        }
      }),
      headers: {
        "Content-type": "application/json; charset=UTF-8"
      }
    })
      .then((response) => response.json())
      .then((json) => console.log(json));
}

function updateBag()
{
    let bag = document.getElementById("bag").value
    let copper = document.getElementById("copper").value
    let silver = document.getElementById("silver").value
    let electrum = document.getElementById("electrum").value
    let platinum = document.getElementById("platinum").value

    fetch("/updateBag", {
      method: "POST",
      body: JSON.stringify({
        contents: bag,
        copper: copper,
        silver: silver,
        electrum: electrum,
        platinum: platinum
      }),
      headers: {
        "Content-type": "application/json; charset=UTF-8"
      }
    })
      .then((response) => response.json())
      .then((json) => console.log(json));
}