package chapter02_designfirststep.damage.v3;

public class DamageLogic {
  int playerArmPower;
  int playerWeaponPower;
  int enemyBodyDefence;
  int enemyArmorDefence;

  int damageMethod() {
    // 変数を使い回さない、目的ごとの変数を用意する
    // 丁寧に目的ごとの変数を用意する
    int totalPlayerAttackPower = playerArmPower + playerWeaponPower;
    int totalEnemyDefence = enemyBodyDefence + enemyArmorDefence;

    int damageAmount = totalPlayerAttackPower - (totalEnemyDefence / 2);
    if (damageAmount < 0) {
      damageAmount = 0;
    }
    return damageAmount;
  }
}
