package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    public ArrayList<Animal> animals = new ArrayList<>();
    private AnimalAdapter animalAdapter;

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        animalAdapter = new AnimalAdapter(this, animals);
        recyclerView = findViewById(R.id.rv_animal);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(animalAdapter);

        imageView = findViewById(R.id.imageView);

        int imageResource = getResources().getIdentifier("@drawable/natlogo", null, this.getPackageName());
        imageView.setImageResource(imageResource);
    }
    private void addData(){
        animals.add(new Animal("Secretary birds","Brids","These raptors of sub-Saharan Africa’s savannas, grasslands, and shrub lands stand at nearly four feet tall—and standing is often how you’ll find them, because they primarily move around on foot. They fly only when necessary, such as to reach their nest in the trees and for courtship displays."));
        animals.add(new Animal("Barn owl","Brids","With its banshee call, dark eyes, and bright white face, a barn owl could pass for a winged ghost, moving silently against the night sky."));
        animals.add(new Animal("Horned screamer","Brids","Horned screamers are the unicorns of the bird world."));
        animals.add(new Animal("Puerto Rican crested toads","Brids","The Puerto Rican crested toad is the only toad species native to Puerto Rico. Named for the bony crests above its large, golden eyes, this toad is also identifiable by an upturned snout and bumpy skin that feels like it’s covered in pebbles. Males are olive green with pads on their thumbs, and females have rougher, dull-brown skin and more prominent crests."));
        animals.add(new Animal("Secretary","Amphibians","The Puerto Rican crested toad is the only toad species native to Puerto Rico. Named for the bony crests above its large, golden eyes, this toad is also identifiable by an upturned snout and bumpy skin that feels like it’s covered in pebbles. Males are olive green with pads on their thumbs, and females have rougher, dull-brown skin and more prominent crests."));
        animals.add(new Animal("Togo slippery frogs","Amphibians","This small and powerful amphibian is part of a family that goes back 70 to 80 million years, to the time of the dinosaurs. The Togo slippery frog ranks 18th in the hundred most genetically distinct and critically endangered in the world: It is as different from other amphibians as humans are from pigs. Although its name implies that it lives in the country of Togo, it’s also found in Ghana."));
        animals.add(new Animal("Beluga Whale","Mammals","Belugas are also called white whales, and their unusual color makes them one of the most familiar and easily distinguishable of all the whales. Calves are born gray or even brown and only fade to white as they become sexually mature around five years of age."));
        animals.add(new Animal("Flying squirrels","Mammals","Flying squirrels are known for soaring anywhere from 150 to 500 feet, sailing from tree to tree to avoid ground predators—but they actually glide rather than fly. Flying squirrels don’t have their own means of propulsion, like a bird or bat, but glide using a furry membrane called the patagium that connects at their wrists down to their ankles. When they leap from a tree and spread their limbs, this flap of loose skin forms a square and acts like a hang glider."));
        animals.add(new Animal("Beaver","Mammals","Beavers are famously busy, and they turn their talents to reengineering the landscape as few other animals can. When sites are available, beavers burrow in the banks of rivers and lakes. But they also transform less suitable habitats by building dams. Felling and gnawing trees with their strong teeth and powerful jaws, they create massive log, branch, and mud structures to block streams and turn fields and forests into the large ponds that beavers love."));
    }
}
